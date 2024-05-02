/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testsenjata;

/**
 *
 * @author ACER Aspire5
 */

public class TestSenjata {
    public static void main(String[] args) {
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");

        System.out.println("AK47 MENEMBAK 3X: " + AK47.menembak(3));
        System.out.println("M16 MENEMBAK 1X: " + M16.menembak(1));

        System.out.println("AK47 MENUSUK : " + AK47.menusuk());
        AK47.pasangBayonet();
        System.out.println("AK47 MENUSUK : " + AK47.menusuk());
    }
}

class Senjata {
    private String nama;
    private boolean bayonetTerpasang;

    public Senjata(String nama) {
        this.nama = nama;
        this.bayonetTerpasang = false;
    }

    public String menembak(int jumlahPeluru) {
        StringBuilder tembakan = new StringBuilder();
        for (int i = 0; i < jumlahPeluru; i++) {
            tembakan.append(nama).append(" ");
        }
        return tembakan.toString().trim();
    }

    public String menusuk() {
        if (bayonetTerpasang) {
            return nama + " menusuk: JLEB!";
        } else {
            return nama + " menusuk: gagal, belum pasang bayonet.";
        }
    }

    public void pasangBayonet() {
        bayonetTerpasang = true;
        System.out.printf("Bayonet Terpasang!\n");
    }
}
