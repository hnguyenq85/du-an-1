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
public class ChiTietKiemKho {
    private int maCTKK;
    private Double soLuongTon;
    private Double soLuongThuc;
    private String ghiChu;
    private int maLT;
    private int maKK;

    public ChiTietKiemKho(int maCTKK, Double soLuongTon, Double soLuongThuc, String ghiChu, int maLT, int maKK) {
        this.maCTKK = maCTKK;
        this.soLuongTon = soLuongTon;
        this.soLuongThuc = soLuongThuc;
        this.ghiChu = ghiChu;
        this.maLT = maLT;
        this.maKK = maKK;
    }

    public int getMaCTKK() {
        return maCTKK;
    }

    public void setMaCTKK(int maCTKK) {
        this.maCTKK = maCTKK;
    }

    public Double getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Double soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Double getSoLuongThuc() {
        return soLuongThuc;
    }

    public void setSoLuongThuc(Double soLuongThuc) {
        this.soLuongThuc = soLuongThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getMaLT() {
        return maLT;
    }

    public void setMaLT(int maLT) {
        this.maLT = maLT;
    }

    public int getMaKK() {
        return maKK;
    }

    public void setMaKK(int maKK) {
        this.maKK = maKK;
    }
    
    
}
