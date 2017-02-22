package com.example.asus_1.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS-1 on 17/02/22.
 */

public class Country extends DataSupport {
    private int id;
    private String countryname;
    private String weatherid;
    private int cityid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
}
