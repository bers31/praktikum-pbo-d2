package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahsisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahsisi =  jumlahsisi;
    }
    public double hitungluas(){
        return panjang*lebar;
    }

    public double hitungkeliling(){
        return (panjang+lebar)*2;
    }
    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi "+ this.getjumlahsisi());
    }
}