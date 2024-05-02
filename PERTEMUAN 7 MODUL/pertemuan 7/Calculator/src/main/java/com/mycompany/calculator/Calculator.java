/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
 
public class Calculator {
    
    // Metode overloading untuk menjumlahkan dua bilangan bulat
    public int add(int a, int b) {
        return a + b;
    }
    
    // Metode overloading untuk menjumlahkan tiga bilangan bulat
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Metode overloading untuk menjumlahkan dua bilangan desimal
    public double add(double a, double b) {
        return a + b;
    }
    
    // Metode overloading untuk menjumlahkan tiga bilangan desimal
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Memanggil metode add untuk menjumlahkan dua bilangan bulat
        int sumInt = calculator.add(5, 10);
        System.out.println("Hasil penjumlahan bilangan bulat: " + sumInt);
        
        // Memanggil metode add untuk menjumlahkan tiga bilangan bulat
        int sumInt3 = calculator.add(5, 10, 15);
        System.out.println("Hasil penjumlahan tiga bilangan bulat: " + sumInt3);
        
        // Memanggil metode add untuk menjumlahkan dua bilangan desimal
        double sumDouble = calculator.add(3.5, 7.8);
        System.out.println("Hasil penjumlahan bilangan desimal: " + sumDouble);
        
        // Memanggil metode add untuk menjumlahkan tiga bilangan desimal
        double sumDouble3 = calculator.add(3.5, 7.8, 1.2);
        System.out.println("Hasil penjumlahan tiga bilangan desimal: " + sumDouble3);
    }
}
/*
metode overloading memungkinkan kita untuk menggunakan nama metode yang sama dengan 
parameter-parameter yang berbeda, sehingga memudahkan penggunaan metode tanpa harus 
mengingat nama-nama metode yang berbeda.
*/