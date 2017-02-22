package com.example.asus_1.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS-1 on 17/02/22.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provincecode;

    public int getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
