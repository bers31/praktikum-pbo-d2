class Airplane extends Vehicle implements Flyer {
    double maxLoad; // Variabel untuk menyimpan beban maksimal pesawat

    Airplane() {
        maxLoad = 300.0; // Inisialisasi nilai beban maksimal dengan 300
    }

    public void takeOff() {
        System.out.println("Pesawat sedang lepas landas"); // Implementasi metode takeOff
    }

    public void fly() {
        System.out.println("Pesawat sedang terbang"); // Implementasi metode fly
    }

    public void land() {
        System.out.println("Pesawat sedang mendarat"); // Implementasi metode land
    }

    public double calcFuelEfficiency() {
        // Menghitung efisiensi bahan bakar dengan berat beban maksimal * 100
        return maxLoad * 100;
    }

    public double calcTripDistance(double kecepatanRataRata, double waktuPerjalanan) {
        // Menghitung jarak perjalanan berdasarkan kecepatan rata-rata dan waktu perjalanan
        // Rumus: jarak = kecepatan × waktu
        double jarak = kecepatanRataRata * waktuPerjalanan;
        return jarak;
    }
}
