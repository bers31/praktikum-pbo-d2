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

    static class Vehicle {
        void calrent (int distance, float price){
            float fare = distance * price;
            System.out.printf("Vehicle price = %.2f\n", fare);
        }
    }

    static class Car extends Vehicle {
        void calrent (int distance, float price){
            float fare = distance * price;
            fare = fare - 100.00f;
            System.out.printf("Car price = %.2f\n", fare);
        }
    }

    static class Bus extends Vehicle {
        void calrent (int distance, float price){
            float fare = distance * price;
            fare = fare - 50.00f;
            System.out.printf("Bus price = %.2f\n", fare);
        }
    }
}

