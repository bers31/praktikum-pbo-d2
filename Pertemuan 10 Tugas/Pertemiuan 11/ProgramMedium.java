import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        // Membuat objek kendaraan: Truck, SeaPlane, dan Helicopter
        Truck truck = new Truck();
        SeaPlane sPlane = new SeaPlane();
        Helicopter copter = new Helicopter();

        // Menampilkan informasi tentang setiap kendaraan
        System.out.println(truck);
        System.out.println(sPlane);
        System.out.println(copter);

        System.out.println("####################################");

        // Membuat daftar armada untuk masing-masing jenis kendaraan
        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        // Menambahkan kendaraan ke dalam kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("####################################");

        // Membuat objek ArmadaKendaraan
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        // Menambahkan armada baru ke dalam objek ArmadaKendaraan
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}
