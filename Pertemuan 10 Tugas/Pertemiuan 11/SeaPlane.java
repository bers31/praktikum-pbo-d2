class SeaPlane extends Airplane {
    SeaPlane() {
        super();
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

    // Metode toString untuk representasi landasan seaplane
    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}