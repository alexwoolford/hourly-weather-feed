package io.woolford;

import io.woolford.database.entity.YearRecord;
import io.woolford.database.mapper.DbMapper;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.logging.Logger;

@Component
public class HistoricWeatherDataGrabber {

    static Logger logger = Logger.getLogger(HistoricWeatherDataGrabber.class.getName());

    private final DbMapper dbMapper;
    private final FileLoader fileLoader;

    @Value("${ftp.hourly.base.path}")
    private String ftpHourlyBasePath;

    @Value("${ftp.noaa.host}")
    private String ftpNoaaHost;

    @Autowired
    public HistoricWeatherDataGrabber(DbMapper dbMapper, FileLoader fileLoader) {
        this.dbMapper = dbMapper;
        this.fileLoader = fileLoader;
    }

    @Scheduled(cron = "0 0 * * * *") //run every hour
    private void grabHistoricWeatherData() throws IOException {

        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(ftpNoaaHost, 21);
        ftpClient.login("anonymous", "guest");

        for (YearRecord yearRecord : dbMapper.getIncompleteYearsRecords()){

            // lists files and directories in the current working directory
            FTPFile[] files = ftpClient.listFiles(ftpHourlyBasePath + yearRecord.getYear());
            for (FTPFile file : files){
                logger.info(file.toString());

                File downloadFile = new File("/tmp/" + file.getName());
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(downloadFile));

                boolean success = ftpClient.retrieveFile(ftpHourlyBasePath + yearRecord.getYear() + "/" + file.getName(), outputStream);
                outputStream.close();

                fileLoader.loadFile(String.valueOf(downloadFile));

            }

        }

        ftpClient.disconnect();

    }

}
