public class Superman extends Kryptonian {
    String name; // Variabel untuk menyimpan nama karakter Superman

    Superman(String name) {
        this.name = name; // Konstruktor untuk menginisialisasi nama karakter
    }

    // Implementasi metode takeOff 
    public void takeOff() {
        System.out.println(name + " sedang mengambil ancang-ancang untuk terbang");
    }

    // Implementasi metode fly
    public void fly() {
        System.out.println(name + " sedang terbang");
    }

    // Implementasi metode land 
    public void land() {
        System.out.println(name + " sedang mendarat");
    }

    // Metode khusus leapBuilding 
    public void leapBuilding() {
        System.out.println(name + " sedang melompati gedung");
    }

    // Metode khusus stopBullet 
    public void stopBullet() {
        System.out.println(name + " sedang menghentikan peluru");
    }
}
