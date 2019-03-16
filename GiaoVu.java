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
public class GiaoVu extends Person {
    Scanner sc = new Scanner(System.in);
    public void nhapThongTinMonHoc(){
        TinChi tc = new TinChi();
        tc.nhapMon();
    }
    public void danhSachSvChuaDongHocPhi(){
       
    }
    @Override
    public void traCuu() {
        SinhVien sv = new SinhVien();
        //Scanner sc = new Scanner(System.in);
        //String ten = sc.nextLine();
        sv.traCuu();
    }
    public Person taoTaiKhoanTruyCap(){
        //hoi xem tao tai khoan cho doi tuong nao
        System.out.println("ban muon tao tai khaon cho doi tuong nao: \n 1.Sinh Vien \n 2.Giao Vien \n 3.Giao Vu");

        int a= sc.nextInt();
        while(a<=0||a>3){
            System.out.println("ban da nhap sai, moi nhap lai");
            a=sc.nextInt();
        }
        // tao doi tuong tai khoan
        Person p = null;
        if(a==1){
            p = new SinhVien();
        }
        else if(a==2){
            p = new GiaoVien();
        }
        else if (a==3){
            p = new GiaoVu();
        }
        // nhap thong tin tai khoan
        p.nhap();
        return p;
        
    }
    public KetQuaTinChi nhapMonVaDiemTinChi(KetQuaTinChi kq){
        kq.nhapKetQua();
        return kq;
    }
    public void timKiemSvNoTin(){
        SinhVien[] sv = new SinhVien[25];
        
    }   
    public void thongKeSinhVienNoTin(){
        
    }
    @Override
    public void nhap() {
  
        System.out.println("nhap ten:");
        name = sc.nextLine();
        System.out.println("nhap ten dang nhap:");
        user = sc.nextLine();
        System.out.println("nhap password:");
        pass = sc.nextLine();
        System.out.println("xac nhan lai password");
        String pass2 =sc.nextLine();
        while(pass2.equals(pass)){
            System.out.println("chua trung khop,moi nhap lai ");
            pass = sc.nextLine();
            pass2 =sc.nextLine();
        }
        
    }

    @Override
    public void hoatDong() {
        System.out.println("moi lua chon: \n 1.Tao tai khoan truy cap \n 2. Nhap thong tin mon hoc \n 3. Tra cuu \n 4. Thong ke sinh vien no tin");
        int n = sc.nextInt();
        sc.nextLine();
        if (n==1){
            taoTaiKhoanTruyCap();
        }
        else if (n==2){
            nhapThongTinMonHoc();
        }
        else if (n==3){
            traCuu();
        }
        else if (n==4){
            thongKeSinhVienNoTin();
        }
        System.out.println("ban co muon tiep tuc");
        String s1 = sc.nextLine();
        if(s1.equals("yes")){
            hoatDong();
        }
    }

}
