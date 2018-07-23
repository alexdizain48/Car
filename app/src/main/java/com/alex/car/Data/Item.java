package com.alex.car.Data;


import java.util.List;

public class Item {

    //Общие данные
    private  String totalHeaderKomplektacija;
    private String totalMarka;
    private String totalVIN;
    private String tatalGod;
    private String totalTipDvigat;
    private String totalMochnost;
    private String totalZavodIzgotovitel;
    private String totalTipCusova;
    private String totalObjemDvigat;
    //Данные тех осмотра
    public List<TehOsmotr> texOsmotr;
    //Пробег
    private String probegDataFiksacii;
    private String probegZnachenie;
    //ОСАГО
    private String osagoHeader;
    private String osagoSerija;
    private String osagoNumber;
    private String osagoStrahCompany;

    public Item(String totalHeaderKomplektacija, String totalMarka, String totalVIN, String tatalGod, String totalTipDvigat, String totalMochnost, String totalZavodIzgotovitel, String totalTipCusova, String totalObjemDvigat, List<TehOsmotr> texOsmotr, String probegDataFiksacii, String probegZnachenie, String osagoHeader, String osagoSerija, String osagoNumber, String osagoStrahCompany) {
        this.totalHeaderKomplektacija = totalHeaderKomplektacija;
        this.totalMarka = totalMarka;
        this.totalVIN = totalVIN;
        this.tatalGod = tatalGod;
        this.totalTipDvigat = totalTipDvigat;
        this.totalMochnost = totalMochnost;
        this.totalZavodIzgotovitel = totalZavodIzgotovitel;
        this.totalTipCusova = totalTipCusova;
        this.totalObjemDvigat = totalObjemDvigat;
        this.texOsmotr = texOsmotr;
        this.probegDataFiksacii = probegDataFiksacii;
        this.probegZnachenie = probegZnachenie;
        this.osagoHeader = osagoHeader;
        this.osagoSerija = osagoSerija;
        this.osagoNumber = osagoNumber;
        this.osagoStrahCompany = osagoStrahCompany;
    }

    public String getTotalHeaderKomplektacija() {
        return totalHeaderKomplektacija;
    }

    public void setTotalHeaderKomplektacija(String totalHeaderKomplektacija) {
        this.totalHeaderKomplektacija = totalHeaderKomplektacija;
    }

    public String getTotalMarka() {
        return totalMarka;
    }

    public void setTotalMarka(String totalMarka) {
        this.totalMarka = totalMarka;
    }

    public String getTotalVIN() {
        return totalVIN;
    }

    public void setTotalVIN(String totalVIN) {
        this.totalVIN = totalVIN;
    }

    public String getTatalGod() {
        return tatalGod;
    }

    public void setTatalGod(String tatalGod) {
        this.tatalGod = tatalGod;
    }

    public String getTotalTipDvigat() {
        return totalTipDvigat;
    }

    public void setTotalTipDvigat(String totalTipDvigat) {
        this.totalTipDvigat = totalTipDvigat;
    }

    public String getTotalMochnost() {
        return totalMochnost;
    }

    public void setTotalMochnost(String totalMochnost) {
        this.totalMochnost = totalMochnost;
    }

    public String getTotalZavodIzgotovitel() {
        return totalZavodIzgotovitel;
    }

    public void setTotalZavodIzgotovitel(String totalZavodIzgotovitel) {
        this.totalZavodIzgotovitel = totalZavodIzgotovitel;
    }

    public String getTotalTipCusova() {
        return totalTipCusova;
    }

    public void setTotalTipCusova(String totalTipCusova) {
        this.totalTipCusova = totalTipCusova;
    }

    public String getTotalObjemDvigat() {
        return totalObjemDvigat;
    }

    public void setTotalObjemDvigat(String totalObjemDvigat) {
        this.totalObjemDvigat = totalObjemDvigat;
    }

    public List<TehOsmotr> getTexOsmotr() {
        return texOsmotr;
    }

    public void setTexOsmotr(List<TehOsmotr> texOsmotr) {
        this.texOsmotr = texOsmotr;
    }

    public String getProbegDataFiksacii() {
        return probegDataFiksacii;
    }

    public void setProbegDataFiksacii(String probegDataFiksacii) {
        this.probegDataFiksacii = probegDataFiksacii;
    }

    public String getProbegZnachenie() {
        return probegZnachenie;
    }

    public void setProbegZnachenie(String probegZnachenie) {
        this.probegZnachenie = probegZnachenie;
    }

    public String getOsagoHeader() {
        return osagoHeader;
    }

    public void setOsagoHeader(String osagoHeader) {
        this.osagoHeader = osagoHeader;
    }

    public String getOsagoSerija() {
        return osagoSerija;
    }

    public void setOsagoSerija(String osagoSerija) {
        this.osagoSerija = osagoSerija;
    }

    public String getOsagoNumber() {
        return osagoNumber;
    }

    public void setOsagoNumber(String osagoNumber) {
        this.osagoNumber = osagoNumber;
    }

    public String getOsagoStrahCompany() {
        return osagoStrahCompany;
    }

    public void setOsagoStrahCompany(String osagoStrahCompany) {
        this.osagoStrahCompany = osagoStrahCompany;
    }
}
