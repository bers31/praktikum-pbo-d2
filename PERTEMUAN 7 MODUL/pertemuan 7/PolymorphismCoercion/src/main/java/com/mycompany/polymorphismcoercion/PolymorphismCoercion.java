/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphismcoercion;

/**
 *
 * @author ACER Aspire5
 */
public class PolymorphismCoercion {
    // Metode untuk mengubah bilangan bulat menjadi hasil kuadratnya
    public int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        PolymorphismCoercion obj = new PolymorphismCoercion(); // Membuat objek dari kelas PolymorphismCoercion

        // Deklarasi objek integer
        Integer num = 10;
        int hasilKuadrat = obj.square(num); // Memanggil metode square melalui objek
        System.out.printf("Hasil kuadrat %d adalah %d\n", num, hasilKuadrat); // Menggunakan printf untuk mencetak hasil
    }
}