/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamdalist;

/**
 *
 * @author ACER Aspire5
 */

import java.util.ArrayList;
public class LamdaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> MahasiswaList =new ArrayList<>();
        MahasiswaList.add("Adi");
        MahasiswaList.add("Bambang");
        MahasiswaList.add("Cici");
        MahasiswaList.add("Didi");
        
        MahasiswaList.forEach((nama)-> System.out.println(nama));
    }
    
}
