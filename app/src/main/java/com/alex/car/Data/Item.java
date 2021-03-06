package com.alex.car.Data;

import java.util.List;

public class Item {

    //Общие данные
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
    private String osagoSerija;
    private String osagoNumber;
    private String osagoStrahCompany;
    //ДТП
    public List<Dtp> dtp;

    public Item() {

    }

    public Item(String totalMarka, String totalVIN, String tatalGod, String totalTipDvigat, String totalMochnost, String totalZavodIzgotovitel, String totalTipCusova, String totalObjemDvigat, List<TehOsmotr> texOsmotr, String probegDataFiksacii, String probegZnachenie, String osagoSerija, String osagoNumber, String osagoStrahCompany, List<Dtp> dtp) {
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
        this.osagoSerija = osagoSerija;
        this.osagoNumber = osagoNumber;
        this.osagoStrahCompany = osagoStrahCompany;
        this.dtp = dtp;
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

    public List<Dtp> getDtp() {
        return dtp;
    }

    public void setDtp(List<Dtp> dtp) {
        this.dtp = dtp;
    }
}
