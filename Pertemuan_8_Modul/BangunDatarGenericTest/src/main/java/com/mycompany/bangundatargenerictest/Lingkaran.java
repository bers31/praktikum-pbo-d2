/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatargenerictest;

/**
 *
 * @author ACER Aspire5
 */
public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran (double jejari){
        this.jejari=jejari;
    }
    
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
