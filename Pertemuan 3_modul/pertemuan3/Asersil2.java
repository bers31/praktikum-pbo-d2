/*
 * File : Asersil2.java
 * Deskripsi : Program untuk demo Asersi yang akan menolak input jika jari-jari lingkaran bernilai 0
 */
class Lingkaran{
    private double jari_jari;
    public Lingkaran(double jari_jari){
        this.jari_jari=jari_jari;
    }
    public double HitungKeliling(){
        double Keliling=2*Math.PI*jari_jari;
        return Keliling;
    }
}
public class Asersil2 {
    public static void main(String[] args) {
        double jari_jari=-1;
        assert(jari_jari>0):"Jari-jari harus lebih dari 0";
        Lingkaran l=new Lingkaran(jari_jari);
        double kelilingLingkaran=l.HitungKeliling();
        System.out.println("keliling lingkaran ="+ kelilingLingkaran);
    }
}
/*
 * Pernyataan assert(jari_jari>0):"Jari-jari harus lebih dari 0" digunakan untuk memastikan bahwa jari-jari lingkaran harus lebih besar dari 0.
 * Seharusnya pernyataan System.out.println("keliling lingkaran ="+ kelilingLingkaran) dijalankan jika jari-jari > 0
 * Harusnya ditambah kondisi if jari_jari>0 untuk mengecek apakah jari-jari > 0 untuk menampilkan keliling lingkaran
 * Kalau jari jari<=0 maka seharusnya keliling lingkaran tidak dihitung
 * Keliling tidak mungkin 0 atau negatif
 * Assertion biasanya digunakan untuk memeriksa kondisi internal program.
 */