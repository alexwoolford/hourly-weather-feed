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
            "     #{soilTemp100})     ")
    public void insertWeatherRecord(WeatherRecord weatherRecord);

//    @Select("SELECT ticker FROM backtesting_the_dow.tickers ")
//    public List<TickerRecord> getTickers();
//
//    @Insert("INSERT INTO backtesting_the_dow.intra_day                                                        " +
//            "    (`datetime`, `close`, `high`, `low`, `open`, `volume`, `ticker`)                             " +
//            "VALUES                                                                                           " +
//            "    (#{datetime}, #{close}, #{high}, #{low}, #{open}, #{volume}, #{ticker})                      " +
//            "ON DUPLICATE KEY UPDATE close=#{close}, high=#{high}, low=#{low}, open=#{open}, volume=#{volume} ")
//    public void insertIntradayRecord(IntradayRecord intradayRecord);

}