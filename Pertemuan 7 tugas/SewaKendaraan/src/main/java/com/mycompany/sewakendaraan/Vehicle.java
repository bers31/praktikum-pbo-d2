/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sewakendaraan;

/**
 *
 * @author ACER Aspire5
 */
public class Vehicle {
    void calrent (int distance, float price){
        float fare = distance * price;
        System.out.printf("Vehicle price = %.2f\n", fare);
    }
}
