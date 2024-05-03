/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sewakendaraan;

/**
 *
 * @author ACER Aspire5
 */

public class SewaKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calrent(50, 1000);
        mobil.calrent(50,1000);
        bis.calrent(50,1000);
    }
}

