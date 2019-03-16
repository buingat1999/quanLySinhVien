/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien extends Person {

    Lop[] lops = new Lop[10];
    TinChi tinChi = new TinChi();
    KetQuaTinChi[] ketQuas = new KetQuaTinChi[25];
    int indextKetQua = 0;
    GiaoVu gvu;

    @Override
    public void traCuu() {
        System.out.println("ban muon tra cuu theo: \n 1.Ten 2.Lop 3.Ma so");
        int n= sc.nextInt();
        sc.nextLine();
        if(n==1){
            System.out.println("");
        }
        else if (n==2){
            System.out.println("moi nhap ma lop:");
            String a= sc.nextLine();
            for(int i=0; i<10; i++){
                if(a==lops[i].maLop){
                    System.out.println("");
                }
            }
        }
        else if (n==3){
            
        }
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void nhap() {
        System.out.println("nhap ten:");
        name = sc.nextLine();
        System.out.println("nhap ten dang nhap:");
        user = sc.nextLine();
        System.out.println("nhap password:");
        pass = sc.nextLine();
        System.out.println("xac nhan lai password");
        String pass2 = sc.nextLine();
        while (pass2.equals(pass) == false) {
            System.out.println("chua trung khop,moi nhap lai ");
            pass = sc.nextLine();
            pass2 = sc.nextLine();
        }

    }

    public GiaoVu ketQuaTc(GiaoVu gvu) {
        KetQuaTinChi kq = new KetQuaTinChi();
        gvu.nhapMonVaDiemTinChi(kq);
        return gvu;
    }

    public void dangKiTinChi(TinChi[] tinChis) {
        // xem danh sach tin chi 
        for (TinChi tc : tinChis) {
            if (tc != null) {
                tc.infoTinChi();
            }
        }
        // nhap ma tin chi co trong danh sach
        int kiemTra=0;
        System.out.println("nhap ma tin chi");
        
        String ma = sc.nextLine();
        for (TinChi tchi : tinChis) {
            if (tchi != null) {
                if (ma.equals(tchi.getMaTinChi())) {
                    kiemTra=1;
                    KetQuaTinChi kq = new KetQuaTinChi();
                    // tim xem co trung voi danh sach da dang ki hay khong
                    for (KetQuaTinChi kqua : ketQuas) {
                        if (ketQuas != null) {
                            if (ma.equals(kqua.getTinChi().getMaTinChi())) {
                                System.out.println("ban da dang ki tin chi nay truoc do roi");
                                return;
                            }
                        }
                    }
                    // nhap dung thi luu vao danh sach Ket qua tin chi
                    kq.setTinChi(tchi);
                    ketQuas[indextKetQua] = kq;
                    indextKetQua++;
                    break;

                }
                
            }
        }
        // nhap sai thong bao khong co va nhap lai
        if(kiemTra==0){
            System.out.println("ma mon hoc khong co trong danh sach");
        }
        // hoi xem co muon dang ki tiep khong
        System.out.println("");
        // yes thi nhap tiep
        // no thi ket thuc
    }

    @Override
    public void hoatDong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
