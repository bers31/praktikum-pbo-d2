/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testsenjata;

/**
 *
 * @author ACER Aspire5
 */
class KontrolSenjata extends Senjata{
    
    public KontrolSenjata(Senjata s) {
        super(s.getBunyi()); // Memanggil konstruktor Senjata dengan suara senjata yang diberikan
    }
    
    // Metode untuk menembak dengan jumlah peluru tertentu
    public void menembak(int jumlahPeluru) {
        System.out.printf(">> Siap menembak " + jumlahPeluru + " kali\n");
        if (getPeluru()>0){
            for (int i = 1; i <= jumlahPeluru; i++) {
                if (getPeluru()>0){
                    System.out.printf(getBunyi()+"\n");
                    totalPeluru-=1;
                }
                else{
                    System.out.printf("Gagal tembak, Peluru Habis\n");
                }
            }
            System.out.printf(">> Peluru sisa:" + getPeluru()+"\n");
        }
        else{
            System.out.printf("Peluru Habis\n");
        }
    }
    
    public Boolean isAdaPeluru(){
        return getPeluru()>0;
    }
    
    public void isiPeluru(int jumlahPeluru){
        setPeluru(jumlahPeluru);
        System.out.printf(">> Peluru berhasil ditambah:" + jumlahPeluru+ "\n");
    }

    public String menusuk() {
        if (suara.equals("TAR")){
            if (isMenusuk()) {
                return "AK47 menusuk: JLEB!";
            } else {
                return "AK47 menusuk: gagal, belum pasang bayonet.";
            }
        }
        else{
            if (isMenusuk()) {
                return "M16 menusuk: JLEB!";
            } else {
                return "M16 menusuk: gagal, belum pasang bayonet.";
            }
        }
    }
    
    public void pasangBayonet() {
        bayonetTerpasang = true;
        System.out.printf("Bayonet Terpasang!\n");
    }
}
