package com.alex.car.Data;

public class TehOsmotr {
    private String tehOsmTipDocumenta;
    private String tehOsmNumber;
    private String tehOsmVINTC;
    private String tehOsmNumberCusovaTC;
    private String tehOsmRegNumber;
    private String tehOsmDataDiagnost;
    private String tehOsmSrokDeistvija;

    public TehOsmotr(String tehOsmTipDocumenta, String tehOsmNumber, String tehOsmVINTC, String tehOsmNumberCusovaTC, String tehOsmRegNumber, String tehOsmDataDiagnost, String tehOsmSrokDeistvija) {
        this.tehOsmTipDocumenta = tehOsmTipDocumenta;
        this.tehOsmNumber = tehOsmNumber;
        this.tehOsmVINTC = tehOsmVINTC;
        this.tehOsmNumberCusovaTC = tehOsmNumberCusovaTC;
        this.tehOsmRegNumber = tehOsmRegNumber;
        this.tehOsmDataDiagnost = tehOsmDataDiagnost;
        this.tehOsmSrokDeistvija = tehOsmSrokDeistvija;
    }

    public String getTehOsmTipDocumenta() {
        return tehOsmTipDocumenta;
    }

    public void setTehOsmTipDocumenta(String tehOsmTipDocumenta) {
        this.tehOsmTipDocumenta = tehOsmTipDocumenta;
    }

    public String getTehOsmNumber() {
        return tehOsmNumber;
    }

    public void setTehOsmNumber(String tehOsmNumber) {
        this.tehOsmNumber = tehOsmNumber;
    }

    public String getTehOsmVINTC() {
        return tehOsmVINTC;
    }

    public void setTehOsmVINTC(String tehOsmVINTC) {
        this.tehOsmVINTC = tehOsmVINTC;
    }

    public String getTehOsmNumberCusovaTC() {
        return tehOsmNumberCusovaTC;
    }

    public void setTehOsmNumberCusovaTC(String tehOsmNumberCusovaTC) {
        this.tehOsmNumberCusovaTC = tehOsmNumberCusovaTC;
    }

    public String getTehOsmRegNumber() {
        return tehOsmRegNumber;
    }

    public void setTehOsmRegNumber(String tehOsmRegNumber) {
        this.tehOsmRegNumber = tehOsmRegNumber;
    }

    public String getTehOsmDataDiagnost() {
        return tehOsmDataDiagnost;
    }

    public void setTehOsmDataDiagnost(String tehOsmDataDiagnost) {
        this.tehOsmDataDiagnost = tehOsmDataDiagnost;
    }

    public String getTehOsmSrokDeistvija() {
        return tehOsmSrokDeistvija;
    }

    public void setTehOsmSrokDeistvija(String tehOsmSrokDeistvija) {
        this.tehOsmSrokDeistvija = tehOsmSrokDeistvija;
    }
}
