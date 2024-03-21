public class BujurSangkar extends BangunDatar{
    public double hitungLuas (double sisi){
        luas=sisi*sisi;
        return luas;
    }
}
/*
 *  Jika kelas BujurSangkar tidak membuat implementasi untuk metode abstrak hitungLuas 
 *  pada kelas BangunDatar, maka BujurSangkar akan menjadi kelas abstrak juga. 
 *  Hal ini karena kelas turunan tidak mengimplementasikan seluruh metode abstrak dari kelas induknya 
 *  sehingga juga menjadi kelas abstrak.
 *  Jika BujurSangkar tidak mengimplementasikan metode hitungLuas yang dideklarasikan sebagai abstrak 
 *  pada kelas BangunDatar, maka BujurSangkar juga harus dinyatakan sebagai kelas abstrak. 
 *  Ini akan menyebabkan kesalahan kompilasi karena tidak mungkin untuk membuat objek dari kelas abstrak.
 *  Jadi, jika tidak ada implementasi untuk metode abstrak yang ada pada kelas induk, 
 *  maka kelas turunan juga harus dinyatakan sebagai kelas abstrak.
 */
