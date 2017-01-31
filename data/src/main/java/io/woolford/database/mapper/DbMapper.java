package io.woolford.database.mapper;

import io.woolford.database.entity.WeatherRecord;
import io.woolford.database.entity.YearRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DbMapper {

    @Select("SELECT             " +
            "  wbanno,          " +
            "  utcTime,         " +
            "  crxVn,           " +
            "  longitude,       " +
            "  latitude,        " +
            "  tCalc,           " +
            "  tHrAvg,          " +
            "  tMax,            " +
            "  tMin,            " +
            "  pCalc,           " +
            "  solarad,         " +
            "  solaradFlag,     " +
            "  solaradMax,      " +
            "  solaradMaxFlag,  " +
            "  solaradMin,      " +
            "  solaradMinFlag,  " +
            "  surTempType,     " +
            "  surTemp,         " +
            "  surTempFlag,     " +
            "  surTempMax,      " +
            "  surTempMaxFlag,  " +
            "  surTempMin,      " +
            "  surTempMinFlag,  " +
            "  rhHrAvg,         " +
            "  rhHrAvgFlag,     " +
            "  soilMoisture5,   " +
            "  soilMoisture10,  " +
            "  soilMoisture20,  " +
            "  soilMoisture50,  " +
            "  soilMoisture100, " +
            "  soilTemp5,       " +
            "  soilTemp10,      " +
            "  soilTemp20,      " +
            "  soilTemp50,      " +
            "  soilTemp100      " +
            "FROM hourly_weather_feed.hourly_weather_feed ")
    public List<WeatherRecord> getWeatherRecords();

    @Select("SELECT      " +
            "  year,     " +
            "  complete  " +
            "FROM hourly_weather_feed.years " +
            "WHERE complete IS FALSE")
    public List<YearRecord> getIncompleteYearsRecords();

    //TODO: upsert to avoid duplicates (see example below)
    @Insert("INSERT INTO hourly_weather_feed.hourly_weather_feed (" +
            "   wbanno,               " +
            "   utcTime,              " +
            "   crxVn,                " +
            "   longitude,            " +
            "   latitude,             " +
            "   tCalc,                " +
            "   tHrAvg,               " +
            "   tMax,                 " +
            "   tMin,                 " +
            "   pCalc,                " +
            "   solarad,              " +
            "   solaradFlag,          " +
            "   solaradMax,           " +
            "   solaradMaxFlag,       " +
            "   solaradMin,           " +
            "   solaradMinFlag,       " +
            "   surTempType,          " +
            "   surTemp,              " +
            "   surTempFlag,          " +
            "   surTempMax,           " +
            "   surTempMaxFlag,       " +
            "   surTempMin,           " +
            "   surTempMinFlag,       " +
            "   rhHrAvg,              " +
            "   rhHrAvgFlag,          " +
            "   soilMoisture5,        " +
            "   soilMoisture10,       " +
            "   soilMoisture20,       " +
            "   soilMoisture50,       " +
            "   soilMoisture100,      " +
            "   soilTemp5,            " +
            "   soilTemp10,           " +
            "   soilTemp20,           " +
            "   soilTemp50,           " +
            "   soilTemp100)          " +
            "VALUES                   " +
            "    (#{wbanno},          " +
            "     #{utcTime},         " +
            "     #{crxVn},           " +
            "     #{longitude},       " +
            "     #{latitude},        " +
            "     #{tCalc},           " +
            "     #{tHrAvg},          " +
            "     #{tMax},            " +
            "     #{tMin},            " +
            "     #{pCalc},           " +
            "     #{solarad},         " +
            "     #{solaradFlag},     " +
            "     #{solaradMax},      " +
            "     #{solaradMaxFlag},  " +
            "     #{solaradMin},      " +
            "     #{solaradMinFlag},  " +
            "     #{surTempType},     " +
            "     #{surTemp},         " +
            "     #{surTempFlag},     " +
            "     #{surTempMax},      " +
            "     #{surTempMaxFlag},  " +
            "     #{surTempMin},      " +
            "     #{surTempMinFlag},  " +
            "     #{rhHrAvg},         " +
            "     #{rhHrAvgFlag},     " +
            "     #{soilMoisture5},   " +
            "     #{soilMoisture10},  " +
            "     #{soilMoisture20},  " +
            "     #{soilMoisture50},  " +
            "     #{soilMoisture100}, " +
            "     #{soilTemp5},       " +
            "     #{soilTemp10},      " +
            "     #{soilTemp20},      " +
            "     #{soilTemp50},      " +
            "     #{soilTemp100})     " +
            "ON DUPLICATE KEY UPDATE                  " +
            "     crxVn=#{crxVn},                     " +
            "     longitude=#{longitude},             " +
            "     latitude=#{latitude},               " +
            "     tCalc=#{tCalc},                     " +
            "     tHrAvg=#{tHrAvg},                   " +
            "     tMax=#{tMax},                       " +
            "     tMin=#{tMin},                       " +
            "     pCalc=#{pCalc},                     " +
            "     solarad=#{solarad},                 " +
            "     solaradFlag=#{solaradFlag},         " +
            "     solaradMax=#{solaradMax},           " +
            "     solaradMaxFlag=#{solaradMaxFlag},   " +
            "     solaradMin=#{solaradMin},           " +
            "     solaradMinFlag=#{solaradMinFlag},   " +
            "     surTempType=#{surTempType},         " +
            "     surTemp=#{surTemp},                 " +
            "     surTempFlag=#{surTempFlag},         " +
            "     surTempMax=#{surTempMax},           " +
            "     surTempMaxFlag=#{surTempMaxFlag},   " +
            "     surTempMin=#{surTempMin},           " +
            "     surTempMinFlag=#{surTempMinFlag},   " +
            "     rhHrAvg=#{rhHrAvg},                 " +
            "     rhHrAvgFlag=#{rhHrAvgFlag},         " +
            "     soilMoisture5=#{soilMoisture5},     " +
            "     soilMoisture10=#{soilMoisture10},   " +
            "     soilMoisture20=#{soilMoisture20},   " +
            "     soilMoisture50=#{soilMoisture50},   " +
            "     soilMoisture100=#{soilMoisture100}, " +
            "     soilTemp5=#{soilTemp5},             " +
            "     soilTemp10=#{soilTemp10},           " +
            "     soilTemp20=#{soilTemp20},           " +
            "     soilTemp50=#{soilTemp50},           " +
            "     soilTemp100=#{soilTemp100}          ")
    public void insertWeatherRecord(WeatherRecord weatherRecord);

}