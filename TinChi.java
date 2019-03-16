/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TinChi {
    Scanner sc = new Scanner(System.in);
    String tenTinChi;
    public String maTinChi;
    int soTinChi;
    String tenGiaoVienDay;

    public String getTenGiaoVienDay() {
        return tenGiaoVienDay;
    }

    public void setTenGiaoVienDay(String tenGiaoVienDay) {
        this.tenGiaoVienDay = tenGiaoVienDay;
    }   

    public void setTenTinChi(String tenTinChi) {
        this.tenTinChi = tenTinChi;
    }

    public String getTenTinChi() {
        return tenTinChi;
    }

    public void setMaTinChi(String maTinChi) {
        this.maTinChi = maTinChi;
    }

    public String getMaTinChi() {
        return maTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getSoTinChi() {
        return soTinChi;
    }
    public void infoTinChi(){
        System.out.println(maTinChi+" "+tenTinChi+" "+soTinChi);
    }
    public void nhapMon(){
        System.out.println("nhap ten: ");
        String a= sc.nextLine();
        System.out.println("nhap ma: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten giao vien giang day: ");
        String t = sc.nextLine();
    }
}
