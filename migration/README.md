# Flyway migration

Flyway has been used to setup the MySQL database that's used by the hourly-weather-feed application. The tables can be created by running from the project root:

    cd migration
    mvn clean compile flyway:migrate

The username/password, JDBC URL, and schema name are read from `flyway.properties`.

