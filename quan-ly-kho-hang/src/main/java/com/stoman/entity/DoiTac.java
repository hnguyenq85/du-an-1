/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.entity;

/**
 *
 * @author Huy
 */
public class DoiTac {
    private String maDT;
    private String tenDT;
    private String diaChi;
    private String email;
    private String soDT;
    private String maLDT;

    public DoiTac(String maDT, String tenDT, String diaChi, String email, String soDT, String maLDT) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.diaChi = diaChi;
        this.email = email;
        this.soDT = soDT;
        this.maLDT = maLDT;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getMaLDT() {
        return maLDT;
    }

    public void setMaLDT(String maLDT) {
        this.maLDT = maLDT;
    }
    
    
}
