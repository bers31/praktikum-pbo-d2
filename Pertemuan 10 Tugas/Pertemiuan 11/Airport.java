class AirPort {
    Airplane airplane; // Variabel untuk menyimpan nama pesawat yang akan mendarat
    String name; // Variabel untuk menyimpan nama bandara

    AirPort(String name) {
        this.name = name; // Inisialisasi nama bandara
    }

    String givePermissionToLand(Flyer flyer) {
        // Metode untuk memberikan izin mendarat kepada objek yang mengimplementasikan interface Flyer
        if (flyer instanceof Airplane) {
            return "Permission granted to land."; // Izin diberikan jika objek adalah pesawat
        } 
        else {
            return "Cannot grant permission to land."; // Izin tidak diberikan jika objek bukan pesawat
        }
    }
}
