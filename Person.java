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
public abstract class Person {
    String name;
    int cmt;
    int truyCap;// 1.Sinh vien ; 2.Giao vien ; 3.Giao vu
    int maSo;
    String user;
    String pass;
    String sdt;
    String gmail;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setCmt(int cmt)
    {
        this.cmt=cmt;
    }
    public int getCmt()
    {
        return cmt;
    }
    public void setTruyCap(int truyCap )
    {
        this.truyCap=truyCap;
    }
    public int getTruyCap()
    {
        return truyCap;
    }
    public void setMaSo(int maSo)
    {
        this.maSo=maSo;
    }
    public int getMaSo()
    {
        return maSo;
    }
    public void setUser(String user)
    {
        this.user=user;
    }
    public String getUser()
    {
        return user;
    }
    public void setPass(String pass)
    {
        this.pass=pass;
    }
    public String getPass()
    {
        return pass;
    }
    public void setSdt(String sdt)
    {
        this.sdt=sdt;
    }
    public String getSdt()
    {
        return sdt;
    }
    public void setGmail(String gmail)
    {
        this.gmail=gmail;
    }
    public String getGmail()
    {
        return gmail;
    }
    public boolean login(String user, String pass){
        if(this.user.equals(user) && this.pass.equals(pass)){
            return true;
        }
        return false;
    }
    public abstract void traCuu();
    public int logout(){
        return 0;
    }
    public abstract void nhap();
    public abstract void hoatDong();
}