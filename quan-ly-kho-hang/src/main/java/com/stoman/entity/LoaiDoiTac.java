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
public class LoaiDoiTac {
    private String maLDT;
    private String tenLDT;

    public LoaiDoiTac(String maLDT, String tenLDT) {
        this.maLDT = maLDT;
        this.tenLDT = tenLDT;
    }
    
    @Override
    public String toString() {
        return this.tenLDT;
    }
    
    @Override
    public boolean equals(Object obj) {
        LoaiDoiTac other = (LoaiDoiTac) obj;
        return other.getMaLDT().equals(this.getMaLDT());
    }

    public String getMaLDT() {
        return maLDT;
    }

    public void setMaLDT(String maLDT) {
        this.maLDT = maLDT;
    }

    public String getTenLDT() {
        return tenLDT;
    }

    public void setTenLDT(String tenLDT) {
        this.tenLDT = tenLDT;
    }
    
    
}
