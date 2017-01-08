USE hourly_weather_feed;

CREATE TABLE hourly_weather_feed (
  wbanno INT,
  utcTime TIMESTAMP,
  crxVn DOUBLE,
  longitude DOUBLE,
  latitude DOUBLE,
  tCalc DOUBLE,
  tHrAvg DOUBLE,
  tMax DOUBLE,
  tMin DOUBLE,
  pCalc DOUBLE,
  solarad INT,
  solaradFlag INT,
  solaradMax INT,
  solaradMaxFlag INT,
  solaradMin INT,
  solaradMinFlag INT,
  surTempType VARCHAR(1),
  surTemp DOUBLE,
  surTempFlag INT,
  surTempMax DOUBLE,
  surTempMaxFlag INT,
  surTempMin DOUBLE,
  surTempMinFlag INT,
  rhHrAvg INT,
  rhHrAvgFlag INT,
  soilMoisture5 DOUBLE,
  soilMoisture10 DOUBLE,
  soilMoisture20 DOUBLE,
  soilMoisture50 DOUBLE,
  soilMoisture100 DOUBLE,
  soilTemp5 DOUBLE,
  soilTemp10 DOUBLE,
  soilTemp20 DOUBLE,
  soilTemp50 DOUBLE,
  soilTemp100 DOUBLE
);

CREATE TABLE years (
  year INT,
  complete BOOLEAN
);

INSERT INTO years (year, complete) VALUES (2000, TRUE );
INSERT INTO years (year, complete) VALUES (2001, TRUE );
INSERT INTO years (year, complete) VALUES (2002, TRUE );
INSERT INTO years (year, complete) VALUES (2003, TRUE );
INSERT INTO years (year, complete) VALUES (2004, TRUE );
INSERT INTO years (year, complete) VALUES (2005, TRUE );
INSERT INTO years (year, complete) VALUES (2006, TRUE );
INSERT INTO years (year, complete) VALUES (2007, TRUE );
INSERT INTO years (year, complete) VALUES (2008, TRUE );
INSERT INTO years (year, complete) VALUES (2009, TRUE );
INSERT INTO years (year, complete) VALUES (2010, TRUE );
INSERT INTO years (year, complete) VALUES (2011, TRUE );
INSERT INTO years (year, complete) VALUES (2012, TRUE );
INSERT INTO years (year, complete) VALUES (2013, TRUE );
INSERT INTO years (year, complete) VALUES (2014, TRUE );
INSERT INTO years (year, complete) VALUES (2015, TRUE );
INSERT INTO years (year, complete) VALUES (2016, TRUE );
INSERT INTO years (year, complete) VALUES (2017, FALSE );

