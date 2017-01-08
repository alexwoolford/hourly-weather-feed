package io.woolford.database.service;



import io.woolford.database.entity.WeatherRecord;
import io.woolford.database.entity.YearRecord;
import io.woolford.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private DbMapper dbMapper;

    public List<WeatherRecord> getWeatherRecords() {
        return dbMapper.getWeatherRecords();
    }

    public List<YearRecord> getIncompleteYearsRecords() {
        return dbMapper.getIncompleteYearsRecords();
    }

    public void insertWeatherRecord(WeatherRecord weatherRecord){
        dbMapper.insertWeatherRecord(weatherRecord);
    }

}