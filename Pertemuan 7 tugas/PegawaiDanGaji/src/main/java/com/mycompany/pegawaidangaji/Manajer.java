/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegawaidangaji;

/**
 *
 * @author ACER Aspire5
 */
class Manajer extends Pegawai {
    public Manajer(String nama) {
        super(nama);
    }

    // Override hitungGaji() untuk Manajer
    @Override
    public double hitungGaji() {
        // Implementasi hitung gaji untuk Manajer
        return 8000.0;
    }

    // Method tambahan untuk menghitung tunjangan Manajer
    public double hitungTunjangan() {
        return 70000.0;
    }
}
