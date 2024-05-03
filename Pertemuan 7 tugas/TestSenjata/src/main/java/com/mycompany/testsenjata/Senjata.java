/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testsenjata;

/**
 *
 * @author ACER Aspire5
 */
class Senjata {
    String suara;
    Integer totalPeluru=0;
    boolean bayonetTerpasang;

    public Senjata(String suara) {
        this.suara = suara;
        this.bayonetTerpasang = false;
    }
    
    public Integer getPeluru (){
        return totalPeluru;
    }
    
    public String getBunyi(){
        return suara;
    }
    
    public void setBUnyi(String Bunyi){
        suara=Bunyi;
    }
    
    public void setPeluru (int jumlahPeluru){
        totalPeluru+=jumlahPeluru;
    }
    
    public void setMenusuk (boolean Menusuk){
        bayonetTerpasang=Menusuk;
    }

    public Boolean isMenusuk(){
        return bayonetTerpasang==true;
    } 
}

