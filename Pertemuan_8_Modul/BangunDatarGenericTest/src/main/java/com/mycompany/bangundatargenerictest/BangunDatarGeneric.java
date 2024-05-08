/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatargenerictest;

/**
 *
 * @author ACER Aspire5
 */
public class BangunDatarGeneric<T1 extends BangunDatar>{
    
    private T1 bangunDatar;
    
    public void set (T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T1 get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
