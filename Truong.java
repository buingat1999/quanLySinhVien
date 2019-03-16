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

public class Truong {

    Person[] persons = new Person[50];
    Lop[] lops = new Lop[10];
    TinChi[] tinChis = new TinChi[25];
    KetQuaTinChi[] ketQua = new KetQuaTinChi[25];
    int dem=0;
    Person currentUser;

    public Truong() {
        GiaoVu gvu = new GiaoVu();
        gvu.setName("Nguyen Van A");
        gvu.setGmail("123@gmail");
        gvu.setCmt(123);
        gvu.setMaSo(6591);
        gvu.setUser("u1");
        gvu.setPass("p1");
        addPerson(gvu);    
        SinhVien sv = new SinhVien();
        sv.setName("Nga");
        sv.setMaSo(1);
        sv.setUser("u2");
        sv.setPass("p2");
        addPerson(sv);
       taoTinChi();
    }

    public TinChi[] getTinChis() {
        return tinChis;
    }
    
    public void taoTinChi(){
        tinChis[0]= new TinChi();
        tinChis[0].setTenTinChi("Toan");
        tinChis[0].setMaTinChi("t01");
        tinChis[0].setSoTinChi(4);
        tinChis[1]= new TinChi();
        tinChis[1].setTenTinChi("Van");
        tinChis[1].setMaTinChi("v01");
        tinChis[1].setSoTinChi(3);
        tinChis[2]= new TinChi();
        tinChis[2].setTenTinChi("Anh");
        tinChis[2].setMaTinChi("a01");
        tinChis[2].setSoTinChi(2);
    }
    public void addPerson(Person person){
        this.persons[this.dem]= person;
        this.dem++;
    }
    public void addDiem(KetQuaTinChi kqtc){
        this.ketQua[this.dem]= kqtc;
        dem++;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap user ");
        String user = sc.nextLine();
        System.out.println("Moi nhap pass ");
        String pass = sc.nextLine();
        kiemTra(user, pass);
    }

    public void kiemTra(String user, String pass) {
        // kiem tra xem user co thuoc truong do khong
        for (int i = 0; i < dem; i++) {

            // neu la nguoi cua truong thi ghi nhan dang nhap thanh cong
            if (persons[i].login(user, pass) == true) {
                currentUser = persons[i];
                break;
            }

        }
        if (currentUser != null) {
            System.out.println("Dang nhap thanh cong");
            menu();
        } // neu khong phai la nguoi cua truong thi thong bao sai user
        else {
            System.out.println("Dang nhap khong thanh cong");
        }
    }
    public boolean check(Person p){
        for(int i=0; i<dem; i++){
           if(p.user.equals( persons[i].user)){
               System.out.println("thong tin bi trung");
               return true;
           }
           
        }
        return false;
    }
    public void taoKetQuaTinChi(GiaoVu gvu){
        KetQuaTinChi kq = new KetQuaTinChi();
        gvu.nhapMonVaDiemTinChi(kq);
        addDiem(kq);
        System.out.println("ban co muon nhap nua khong?");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(s.equals("yes")){
            taoKetQuaTinChi(gvu);
        }
    }
    public void taoTaiKhoan(GiaoVu gvu){
        Person p= gvu.taoTaiKhoanTruyCap();
        // kiem tra xem tai khoan moi nhap co trung voi tai khoan co roi hay chua
        // neu trung thi thong bao roi nhap lai
        while(check(p)){
            System.out.println("moi nhap lai:");
            p= gvu.taoTaiKhoanTruyCap();
        
        }
        // neu khong trung thi luu lai
        addPerson(p);
        //hoi xem co nhap tiep nua khong
        System.out.println("ban co muon nhap nua khong?");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        if(s.equals("yes")){
           taoTaiKhoan(gvu);
        }
    }
    public void menu(){
        currentUser.hoatDong();
    }
        
}
