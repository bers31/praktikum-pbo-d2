abstract class Vehicle {
    public double calcFuelEfficiency() {
        return 0.0; // Implementasi default calcFuelEfficiency selalu 0
    }

    public double calcTripDistance() {
        return 0.0; // Implementasi default calcTripDistance selalu 0
    }

    // Metode toString untuk representasi objek berdasarkan nama kelas
    public String toString() {
        return this.getClass().getSimpleName(); 
    }
}