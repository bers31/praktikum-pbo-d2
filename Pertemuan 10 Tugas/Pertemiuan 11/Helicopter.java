class Helicopter extends Vehicle implements Flyer {
    double maxLoad; // Variabel untuk menyimpan beban maksimal helikopter

    Helicopter() {
        maxLoad = 500.0; // Inisialisasi nilai beban maksimal 500
    }

    // Implementasi metode takeOff 
    public void takeOff() {
        System.out.println("Helicopter sedang lepas landas");
    }

    // Implementasi metode fly 
    public void fly() {
        System.out.println("Helicopter sedang terbang");
    }

    // Implementasi metode land 
    public void land() {
        System.out.println("Helicopter sedang mendarat");
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

    // Metode toString untuk representasi landasan helikopter
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
