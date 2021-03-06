package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 橙子皮 on 2017/4/12.
 */

public class County extends DataSupport {

    private int countyId;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
