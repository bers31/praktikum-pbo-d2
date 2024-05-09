/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainkupu;

/**
 *
 * @author ACER Aspire5
 */
public class MainKupu {
    /*{kamus}
    K : Ulat 
    anu : Data<Kupu>
    {algoritma}*/
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
        
    }
}

