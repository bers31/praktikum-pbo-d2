/*
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan eksepsi buatan sendiri, pengenalan klausa throw dan throws
 */
public class AngkaSial {
    public void cobaAngka(int Angka) throws AngkaSialException{
        if(Angka==13){
            throw new AngkaSialException();
        }
        System.out.println(Angka + " Bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}
/*
 Ketika eksepsi terjadi, baris System.out.println(Angka + " Bukan angka sial"); tidak akan dieksekusi
 Baris catch(AngkaSialException ase) akan dieksekusi karena as.cobaAngka(13) (Angka==13 sehingga AngkaSial Exception dijalankan)
 */