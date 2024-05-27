class RiverBarge extends Vehicle {
    double maxLoad; // Variabel untuk menyimpan beban maksimal kapal tongkang

    public RiverBarge() {
        maxLoad = 400.0; // Inisialisasi nilai beban maksimal 400
    }

    // Metode khusus: calcFuelEfficiency 
    public double calcFuelEfficiency() {
        // Menghitung efisiensi bahan bakar dengan berat beban maksimal * 150
        return maxLoad * 150;
    }

    public double calcTripDistance(double kecepatanRataRata, double waktuPerjalanan) {
        // Menghitung jarak perjalanan berdasarkan kecepatan rata-rata dan waktu perjalanan
        // Rumus: jarak = kecepatan × waktu
        double jarak = kecepatanRataRata * waktuPerjalanan;
        return jarak;
    }
}
