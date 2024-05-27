class Truck extends Vehicle {
    double maxLoad; // Variabel untuk menyimpan beban maksimal truk

    public Truck() {
        maxLoad = 100.0; // Inisialisasi nilai beban maksimal 100
    }

    // Metode untuk mendapatkan nilai beban maksimal truk
    public double getTruckmaxLoad() {
        return maxLoad;
    }

    // Metode khusus: calcFuelEfficiency 
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

    // Metode toString untuk representasi kendaraan truck
    public String toString() {
        return "Truk adalah angkutan darat yang sangat handal";
    }
}
