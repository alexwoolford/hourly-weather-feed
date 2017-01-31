package io.woolford;


import io.woolford.database.entity.WeatherRecord;
import io.woolford.database.mapper.DbMapper;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

@Component
class FileLoader {

    static Logger logger = Logger.getLogger(FileLoader.class.getName());

    final
    DbMapper dbMapper;

    @Autowired
    public FileLoader(DbMapper dbMapper) {
        this.dbMapper = dbMapper;
    }

    void loadFile(String fileName){

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach((line)->{
                try {
                    insertRecord(line);
                } catch (ParseException e) {
                    logger.log(Level.WARNING, e.getMessage());
                }
            });

            logger.info("Loaded file: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    private void insertRecord(String recordRaw) throws ParseException {

        String[] recordArray = recordRaw.split("[ ]+");

        WeatherRecord weatherRecord = new WeatherRecord();
        weatherRecord.setWbanno(Integer.parseInt(recordArray[0]));
        weatherRecord.setUtcTime(parseDateHour(recordArray[1], recordArray[2]));
        weatherRecord.setCrxVn(Double.parseDouble(recordArray[5]));
        weatherRecord.setLongitude(Double.parseDouble(recordArray[6]));
        weatherRecord.setLatitude(Double.parseDouble(recordArray[7]));
        weatherRecord.settCalc(Double.parseDouble(recordArray[8]));
        weatherRecord.settHrAvg(Double.parseDouble(recordArray[9]));
        weatherRecord.settMax(Double.parseDouble(recordArray[10]));
        weatherRecord.settMin(Double.parseDouble(recordArray[11]));
        weatherRecord.setpCalc(Double.parseDouble(recordArray[12]));
        weatherRecord.setSolarad(Integer.parseInt(recordArray[13]));
        weatherRecord.setSolaradFlag(Integer.parseInt(recordArray[14]));
        weatherRecord.setSolaradMax(Integer.parseInt(recordArray[15]));
        weatherRecord.setSolaradMaxFlag(Integer.parseInt(recordArray[16]));
        weatherRecord.setSolaradMin(Integer.parseInt(recordArray[17]));
        weatherRecord.setSolaradMinFlag(Integer.parseInt(recordArray[18]));
        weatherRecord.setSurTempType(recordArray[19]);
        weatherRecord.setSurTemp(Double.parseDouble(recordArray[20]));
        weatherRecord.setSurTempFlag(Integer.parseInt(recordArray[21]));
        weatherRecord.setSurTempMax(Double.parseDouble(recordArray[22]));
        weatherRecord.setSurTempMaxFlag(Integer.parseInt(recordArray[23]));
        weatherRecord.setSurTempMin(Double.parseDouble(recordArray[24]));
        weatherRecord.setSurTempMinFlag(Integer.parseInt(recordArray[25]));
        weatherRecord.setRhHrAvg(Integer.parseInt(recordArray[26]));
        weatherRecord.setRhHrAvgFlag(Integer.parseInt(recordArray[27]));
        weatherRecord.setSoilMoisture5(Double.parseDouble(recordArray[28]));
        weatherRecord.setSoilMoisture10(Double.parseDouble(recordArray[29]));
        weatherRecord.setSoilMoisture20(Double.parseDouble(recordArray[30]));
        weatherRecord.setSoilMoisture50(Double.parseDouble(recordArray[31]));
        weatherRecord.setSoilMoisture100(Double.parseDouble(recordArray[32]));
        weatherRecord.setSoilTemp5(Double.parseDouble(recordArray[33]));
        weatherRecord.setSoilTemp10(Double.parseDouble(recordArray[34]));
        weatherRecord.setSoilTemp20(Double.parseDouble(recordArray[35]));
        weatherRecord.setSoilTemp50(Double.parseDouble(recordArray[36]));
        weatherRecord.setSoilTemp100(Double.parseDouble(recordArray[37]));

        dbMapper.insertWeatherRecord(weatherRecord);

    }

    private static Date parseDateHour(String dateString, String hourString) throws ParseException {

        // TODO: validation around input string to throw specific error
        String year = dateString.substring(0, 4);
        String month = dateString.substring(4, 6);
        String day = dateString.substring(6, 8);

        String hour = hourString.substring(0, 2);
        String minute = hourString.substring(2, 4);

        String iso8601DateString = year + "-" + month + "-" + day + "T" + hour + ":" + minute + ":00Z";

        DateTime dateTime = new DateTime(iso8601DateString);

        return dateTime.toDate();

    }


}
