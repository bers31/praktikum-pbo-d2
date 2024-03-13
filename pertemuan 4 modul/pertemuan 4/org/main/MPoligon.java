package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,4,4);
        Segitiga segitiga = new Segitiga(5, 3, 3, 3, 3);
        persegi.printInfo();
        segitiga.printInfo();
        System.out.println("Luas Persegi Panjang: "+persegi.hitungluas());
        System.out.println("Keliling Persegi: "+persegi.hitungkeliling());
        System.out.println("Luas Segitiga: "+segitiga.hitungluas());
        System.out.println("Keliling Segitiga: "+segitiga.hitungkeliling());
    }
}
