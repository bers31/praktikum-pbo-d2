import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari Lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jari-jari "+jejari+"satuan adalah " + l.hitungLuas());
        // Menutup Scanner setelah selesai menggunakannya
        scan.close();
    }
}
