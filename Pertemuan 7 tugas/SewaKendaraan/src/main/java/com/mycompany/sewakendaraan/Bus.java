/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sewakendaraan;

/**
 *
 * @author ACER Aspire5
 */
public class Bus extends Vehicle {
    void calrent (int distance, float price){
        float fare = distance * price;
        fare = fare - 50.00f;
        System.out.printf("Bus price = %.2f\n", fare);
    }
}
