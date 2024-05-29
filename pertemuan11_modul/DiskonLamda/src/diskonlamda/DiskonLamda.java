/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diskonlamda;

/**
 *
 * @author ACER Aspire5
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}
public class DiskonLamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDiskon diskonmerdeka = new IDiskon(){
            @Override
            public double hitungDiskon (int harga){
                return harga - (harga*0.3);
            }
        };
        IDiskon diskonlebaran = (harga) -> harga - (harga*0.4);
        IDiskon diskonbiasa = (harga) ->{
            return harga - (harga*0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonmerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonlebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonbiasa.hitungDiskon(45000));
    }
    
}
