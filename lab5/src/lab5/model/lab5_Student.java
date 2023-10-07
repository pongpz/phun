/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.model;

/**
 *
 * @author j
 */
public class lab5_Student {
        private String MASV;
        private String HOTEN;
        private String EMAIL;
        private String SODT;
        private String DIACHI;
        private boolean GIOITINH;

    public lab5_Student(String MASV, String HOTEN, String EMAIL, String SODT, String DIACHI, boolean GIOITINH) {
        this.MASV = MASV;
        this.HOTEN = HOTEN;
        this.EMAIL = EMAIL;
        this.SODT = SODT;
        this.DIACHI = DIACHI;
        this.GIOITINH = GIOITINH;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String SODT) {
        this.SODT = SODT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public boolean isGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(boolean GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    
        
        
}
