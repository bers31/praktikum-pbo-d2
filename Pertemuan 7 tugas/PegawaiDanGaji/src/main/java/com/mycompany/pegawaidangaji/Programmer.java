/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegawaidangaji;

/**
 *
 * @author ACER Aspire5
 */

class Programmer extends Pegawai {
    public Programmer(String nama) {
        super(nama);
    }

    // Override hitungGaji() untuk Programmer
    @Override
    public double hitungGaji() {
        // Implementasi hitung gaji untuk Programmer
        return 5000.0;
    }

    // Method tambahan untuk menghitung bonus Programmer
    public double hitungBonus() {
        return 45000.0;
    }
}
