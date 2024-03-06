/*
 * File : Asersil1.java
 * Deskripsi : Program untuk menunjukkan Asersi
 */
public class Asersil1{
    public static void main(String[] args) {
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0):"Ada kesalahan dalam kode";
            System.out.println("x bilangan negatif");
        }
    }
}