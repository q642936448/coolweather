package com.example.asus_1.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS-1 on 17/02/22.
 */

public class City extends DataSupport {
    private int id;

    private String cityname;

    private int citycode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
