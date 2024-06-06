package jdbc.model;

public class Mahasiswa {

    private int id;
    private String name;

    // Konstruktor default
    public Mahasiswa() {
    }

    // Konstruktor dengan nama saja
    public Mahasiswa(String name) {
        this.name = name;
    }

    // Konstruktor dengan id dan nama
    public Mahasiswa(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", name=" + name + '}';
    }
}
