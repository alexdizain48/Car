package com.alex.car.Data;

import android.widget.ImageView;

public class Dtp {

    private String dtpData, dtpTip, dtpRegionProishestwija;
    private ImageView dtpImg;

    public Dtp(String dtpData, String dtpTip, String dtpRegionProishestwija, ImageView dtpImg) {
        this.dtpData = dtpData;
        this.dtpTip = dtpTip;
        this.dtpRegionProishestwija = dtpRegionProishestwija;
        this.dtpImg = dtpImg;
    }

    public String getDtpData() {
        return dtpData;
    }

    public void setDtpData(String dtpData) {
        this.dtpData = dtpData;
    }

    public String getDtpTip() {
        return dtpTip;
    }

    public void setDtpTip(String dtpTip) {
        this.dtpTip = dtpTip;
    }

    public String getDtpRegionProishestwija() {
        return dtpRegionProishestwija;
    }

    public void setDtpRegionProishestwija(String dtpRegionProishestwija) {
        this.dtpRegionProishestwija = dtpRegionProishestwija;
    }

    public ImageView getDtpImg() {
        return dtpImg;
    }

    public void setDtpImg(ImageView dtpImg) {
        this.dtpImg = dtpImg;
    }
}
