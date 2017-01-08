package io.woolford.database.entity;

import java.util.Date;

public class WeatherRecord {

    //TODO: change to primitives once it's established which columns are allowed to contain nulls.

    private Integer wbanno;
    private Date utcTime;
    private Double crxVn;
    private Double longitude;
    private Double latitude;
    private Double tCalc;
    private Double tHrAvg;
    private Double tMax;
    private Double tMin;
    private Double pCalc;
    private Integer solarad;
    private Integer solaradFlag;
    private Integer solaradMax;
    private Integer solaradMaxFlag;
    private Integer solaradMin;
    private Integer solaradMinFlag;
    private String surTempType;
    private Double surTemp;
    private Integer surTempFlag;
    private Double surTempMax;
    private Integer surTempMaxFlag;
    private Double surTempMin;
    private Integer surTempMinFlag;
    private Integer rhHrAvg;
    private Integer rhHrAvgFlag;
    private Double soilMoisture5;
    private Double soilMoisture10;
    private Double soilMoisture20;
    private Double soilMoisture50;
    private Double soilMoisture100;
    private Double soilTemp5;
    private Double soilTemp10;
    private Double soilTemp20;
    private Double soilTemp50;
    private Double soilTemp100;


    public Integer getWbanno() {
        return wbanno;
    }

    public void setWbanno(Integer wbanno) {
        this.wbanno = wbanno;
    }

    public Date getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(Date utcTime) {
        this.utcTime = utcTime;
    }

    public Double getCrxVn() {
        return crxVn;
    }

    public void setCrxVn(Double crxVn) {
        this.crxVn = crxVn;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double gettCalc() {
        return tCalc;
    }

    public void settCalc(Double tCalc) {
        this.tCalc = tCalc;
    }

    public Double gettHrAvg() {
        return tHrAvg;
    }

    public void settHrAvg(Double tHrAvg) {
        this.tHrAvg = tHrAvg;
    }

    public Double gettMax() {
        return tMax;
    }

    public void settMax(Double tMax) {
        this.tMax = tMax;
    }

    public Double gettMin() {
        return tMin;
    }

    public void settMin(Double tMin) {
        this.tMin = tMin;
    }

    public Double getpCalc() {
        return pCalc;
    }

    public void setpCalc(Double pCalc) {
        this.pCalc = pCalc;
    }

    public Integer getSolarad() {
        return solarad;
    }

    public void setSolarad(Integer solarad) {
        this.solarad = solarad;
    }

    public Integer getSolaradFlag() {
        return solaradFlag;
    }

    public void setSolaradFlag(Integer solaradFlag) {
        this.solaradFlag = solaradFlag;
    }

    public Integer getSolaradMax() {
        return solaradMax;
    }

    public void setSolaradMax(Integer solaradMax) {
        this.solaradMax = solaradMax;
    }

    public Integer getSolaradMaxFlag() {
        return solaradMaxFlag;
    }

    public void setSolaradMaxFlag(Integer solaradMaxFlag) {
        this.solaradMaxFlag = solaradMaxFlag;
    }

    public Integer getSolaradMin() {
        return solaradMin;
    }

    public void setSolaradMin(Integer solaradMin) {
        this.solaradMin = solaradMin;
    }

    public Integer getSolaradMinFlag() {
        return solaradMinFlag;
    }

    public void setSolaradMinFlag(Integer solaradMinFlag) {
        this.solaradMinFlag = solaradMinFlag;
    }

    public String getSurTempType() {
        return surTempType;
    }

    public void setSurTempType(String surTempType) {
        this.surTempType = surTempType;
    }

    public Double getSurTemp() {
        return surTemp;
    }

    public void setSurTemp(Double surTemp) {
        this.surTemp = surTemp;
    }

    public Integer getSurTempFlag() {
        return surTempFlag;
    }

    public void setSurTempFlag(Integer surTempFlag) {
        this.surTempFlag = surTempFlag;
    }

    public Double getSurTempMax() {
        return surTempMax;
    }

    public void setSurTempMax(Double surTempMax) {
        this.surTempMax = surTempMax;
    }

    public Integer getSurTempMaxFlag() {
        return surTempMaxFlag;
    }

    public void setSurTempMaxFlag(Integer surTempMaxFlag) {
        this.surTempMaxFlag = surTempMaxFlag;
    }

    public Double getSurTempMin() {
        return surTempMin;
    }

    public void setSurTempMin(Double surTempMin) {
        this.surTempMin = surTempMin;
    }

    public Integer getSurTempMinFlag() {
        return surTempMinFlag;
    }

    public void setSurTempMinFlag(Integer surTempMinFlag) {
        this.surTempMinFlag = surTempMinFlag;
    }

    public Integer getRhHrAvg() {
        return rhHrAvg;
    }

    public void setRhHrAvg(Integer rhHrAvg) {
        this.rhHrAvg = rhHrAvg;
    }

    public Integer getRhHrAvgFlag() {
        return rhHrAvgFlag;
    }

    public void setRhHrAvgFlag(Integer rhHrAvgFlag) {
        this.rhHrAvgFlag = rhHrAvgFlag;
    }

    public Double getSoilMoisture5() {
        return soilMoisture5;
    }

    public void setSoilMoisture5(Double soilMoisture5) {
        this.soilMoisture5 = soilMoisture5;
    }

    public Double getSoilMoisture10() {
        return soilMoisture10;
    }

    public void setSoilMoisture10(Double soilMoisture10) {
        this.soilMoisture10 = soilMoisture10;
    }

    public Double getSoilMoisture20() {
        return soilMoisture20;
    }

    public void setSoilMoisture20(Double soilMoisture20) {
        this.soilMoisture20 = soilMoisture20;
    }

    public Double getSoilMoisture50() {
        return soilMoisture50;
    }

    public void setSoilMoisture50(Double soilMoisture50) {
        this.soilMoisture50 = soilMoisture50;
    }

    public Double getSoilMoisture100() {
        return soilMoisture100;
    }

    public void setSoilMoisture100(Double soilMoisture100) {
        this.soilMoisture100 = soilMoisture100;
    }

    public Double getSoilTemp5() {
        return soilTemp5;
    }

    public void setSoilTemp5(Double soilTemp5) {
        this.soilTemp5 = soilTemp5;
    }

    public Double getSoilTemp10() {
        return soilTemp10;
    }

    public void setSoilTemp10(Double soilTemp10) {
        this.soilTemp10 = soilTemp10;
    }

    public Double getSoilTemp20() {
        return soilTemp20;
    }

    public void setSoilTemp20(Double soilTemp20) {
        this.soilTemp20 = soilTemp20;
    }

    public Double getSoilTemp50() {
        return soilTemp50;
    }

    public void setSoilTemp50(Double soilTemp50) {
        this.soilTemp50 = soilTemp50;
    }

    public Double getSoilTemp100() {
        return soilTemp100;
    }

    public void setSoilTemp100(Double soilTemp100) {
        this.soilTemp100 = soilTemp100;
    }

    @Override
    public String toString() {
        return "WeatherRecord{" +
                "wbanno=" + wbanno +
                ", utcTime=" + utcTime +
                ", crxVn=" + crxVn +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", tCalc=" + tCalc +
                ", tHrAvg=" + tHrAvg +
                ", tMax=" + tMax +
                ", tMin=" + tMin +
                ", pCalc=" + pCalc +
                ", solarad=" + solarad +
                ", solaradFlag=" + solaradFlag +
                ", solaradMax=" + solaradMax +
                ", solaradMaxFlag=" + solaradMaxFlag +
                ", solaradMin=" + solaradMin +
                ", solaradMinFlag=" + solaradMinFlag +
                ", surTempType='" + surTempType + '\'' +
                ", surTemp=" + surTemp +
                ", surTempFlag=" + surTempFlag +
                ", surTempMax=" + surTempMax +
                ", surTempMaxFlag=" + surTempMaxFlag +
                ", surTempMin=" + surTempMin +
                ", surTempMinFlag=" + surTempMinFlag +
                ", rhHrAvg=" + rhHrAvg +
                ", rhHrAvgFlag=" + rhHrAvgFlag +
                ", soilMoisture5=" + soilMoisture5 +
                ", soilMoisture10=" + soilMoisture10 +
                ", soilMoisture20=" + soilMoisture20 +
                ", soilMoisture50=" + soilMoisture50 +
                ", soilMoisture100=" + soilMoisture100 +
                ", soilTemp5=" + soilTemp5 +
                ", soilTemp10=" + soilTemp10 +
                ", soilTemp20=" + soilTemp20 +
                ", soilTemp50=" + soilTemp50 +
                ", soilTemp100=" + soilTemp100 +
                '}';
    }

}
