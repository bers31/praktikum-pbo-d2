import java.util.ArrayList;
import java.util.Collection;

public class ArmadaKendaraan {
    private ArrayList<Vehicle> daftarArmada; // Variabel untuk menyimpan daftar armada kendaraan

    public ArmadaKendaraan() {
        daftarArmada = new ArrayList<>(); // Inisialisasi daftar armada sebagai ArrayList kosong
    }

    public void tambahArmada(Collection<? extends Vehicle> armada) {
        daftarArmada.addAll(armada); // Menambahkan seluruh kendaraan dari koleksi armada ke daftar armada
    }

    public ArrayList<Vehicle> getAllArmada() {
        return daftarArmada; // Mengembalikan seluruh daftar armada kendaraan
    }
}
