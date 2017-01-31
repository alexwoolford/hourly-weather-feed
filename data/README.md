# data

The data module collects the data, every hour, from NOAA's FTP site.

To run this application:

    mvn clean package
    nohup ./target/data-1.0-SNAPSHOT.jar &

Logs for this application are written to `/var/log/hourly-weather-feed/`.

To do:

1. daemonize this process
