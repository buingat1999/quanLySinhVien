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
public class GiaoVien extends Person {
    Lop[] lops = new Lop[10];
    TinChi[] tinChi = new TinChi[25];
    SinhVien[] sv = new SinhVien[25];

    @Override
    public void traCuu() {
       Scanner sc = new Scanner(System.in);
       String lop = sc.nextLine();
       if(lop.equals(lops)){
           System.out.println("--- Thong tin lop hoc ---");
           System.out.println(sv);
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
        System.out.println("nhap lai password");
        String pass2 =sc.nextLine();
        while(pass2.equals( pass)== false){
            System.out.println("chua trung khop ");
            pass2 =sc.nextLine();
        }
        
    
    }

    @Override
    public void hoatDong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
