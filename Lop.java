/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Lop {
    GiaoVien gv;
    TinChi tinChi;
    String tenLop;
    String maLop;

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public GiaoVien getGv() {
        return gv;
    }

    public TinChi getTinChi() {
        return tinChi;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setGv(GiaoVien gv) {
        this.gv = gv;
    }

    public void setTinChi(TinChi tinChi) {
        this.tinChi = tinChi;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    
 
}
