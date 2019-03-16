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
public class KetQuaTinChi {
    TinChi tinChi ;
    boolean hocPhi;
    int diemTinChi;

    public TinChi getTinChi() {
        return tinChi;
    }

    public void setTinChi(TinChi tinChi) {
        this.tinChi = tinChi;
    }

    public boolean isHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(boolean hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getDiemTinChi() {
        return diemTinChi;
    }

    public void setDiemTinChi(int diemTinChi) {
        this.diemTinChi = diemTinChi;
    }
    
    public void nhapKetQua(){
        KetQuaTinChi kq = new KetQuaTinChi();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten tin chi: ");
        tinChi.tenTinChi = sc.nextLine();
        System.out.println("nhap ma tin chi:");
        tinChi.maTinChi = sc.nextLine();
        System.out.println("nhap diem tin chi:");
        diemTinChi = sc.nextInt();
        
    }
}
