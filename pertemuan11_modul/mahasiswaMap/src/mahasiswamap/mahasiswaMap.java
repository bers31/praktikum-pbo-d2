/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswamap;

/**
 *
 * @author ACER Aspire5
 */
import java.util.HashMap;
import java.util.Map;

public class mahasiswaMap {
    public static void main(String[] args) {
        // Buat Map dengan key (NIM) dan value (nama mahasiswa)
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(2406012, "Bernardo");
        mahasiswaMap.put(1234567, "Qun");
        mahasiswaMap.put(9876543, "Ilham");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}

