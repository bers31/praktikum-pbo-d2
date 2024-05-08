/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangundatargenerictest;

/**
 *
 * @author ACER Aspire5
 */
public class BangunDatarGenericTest {

    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran: "+bdg.hitungKeliling());
        System.out.println("Tipe Generic: "+bdg.get().getClass().getSimpleName());
    }
}
