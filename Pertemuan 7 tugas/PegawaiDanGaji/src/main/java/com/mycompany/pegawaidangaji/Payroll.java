/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegawaidangaji;

/**
 *
 * @author ACER Aspire5
 */
class Payroll {
    public void cetakGaji(Pegawai pegawai) {
        // Cetak nama dan gaji pegawai
        System.out.println("Nama: " + pegawai.nama);
        System.out.println("Gaji: $" + pegawai.hitungGaji());

        // Cek apakah pegawai merupakan Programmer atau Manajer
        if (pegawai instanceof Programmer) {
            Programmer programmer = (Programmer) pegawai;
            System.out.println("Bonus: $" + programmer.hitungBonus());
        } else if (pegawai instanceof Manajer) {
            Manajer manajer = (Manajer) pegawai;
            System.out.println("Tunjangan: $" + manajer.hitungTunjangan());
        }

        System.out.println(); // Pemisah antar pegawai
    }
}
