/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pegawaidangaji;

/**
 *
 * @author ACER Aspire5
 */


public class PegawaiDanGaji {
    public static void main(String[] args) {
        // Membuat objek pegawai sesuai dengan jabatannya
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        // Membuat objek payroll
        Payroll payroll = new Payroll();

        // Mencetak gaji pegawai
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
