# hourly-weather-feed

NOAA has an FTP site that publishes hourly weather data. This historic data goes back to year 2000, and contains measurements from a number of stations across the United States.

This Spring application grabs that data from the FTP site, and writes it to a MySQL database. The intention of this project was to make it easy for analysts to rapidly acquire a self-updating weather dataset that spans a long period of time.

There are two projects in this repo:

1. `migration`: a flyway migration to setup MySQL with the tables it needs to capture the weather data
2. `data`: the application that harvests the data from NOAA's FTP

To setup this feed, run the [Flyway](https://flywaydb.org/) migration first.
