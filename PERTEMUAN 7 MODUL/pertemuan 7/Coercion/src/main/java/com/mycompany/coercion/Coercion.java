/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coercion;

/**
 *
 * @author ACER Aspire5
 */
public class Coercion {

    public static void main(String[] args) {
        int output1 = 'a'; // Coercion: 'a' akan diubah menjadi nilai ASCII-nya
        double x = 15.5;
        int output2 = (int) x; // Casting: double x diubah menjadi int
        int y = 25; 
        double output3 = y; // Coercion: int y akan diubah secara implisit menjadi double
        int z = 78; 
        char output4 = (char) z; // Casting: int z diubah menjadi char
        char a = 'a';
        double output5 = a; // Coercion: 'a' akan diubah menjadi nilai ASCII-nya
         // Menampilkan nilai variabel ke dalam console
        System.out.println("Nilai output1: " + output1);
        System.out.println("Nilai output2: " + output2);
        System.out.println("Nilai output3: " + output3);
        System.out.println("Nilai output4: " + output4);
        System.out.println("Nilai output5: " + output5);
    }
}