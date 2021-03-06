package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 橙子皮 on 2017/4/12.
 */

public class Province extends DataSupport {
    private  int provinceId;
    private  String provinceName;
    private int provinceCode;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
