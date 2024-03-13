package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi, sisi1, sisi2;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, int jumlahsisi){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisi1=sisi1;
        this.sisi2=sisi2;
        this.jumlahsisi=jumlahsisi;
    }
    public double hitungluas(){
        return alas*tinggi*0.5;
    }

    public double hitungkeliling(){
        return sisi1+sisi2+alas;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi "+ this.getjumlahsisi());
    }
}
