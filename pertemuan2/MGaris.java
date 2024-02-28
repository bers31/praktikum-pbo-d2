public class MGaris {
    public static void main(String[] args) {
 
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik();
        Titik t4 = new Titik();

        t1.setAbsis(3);
        t1.setOrdinat(4);
        t2.setAbsis(5);
        t2.setOrdinat(12);

        t3.setAbsis(4);
        t3.setOrdinat(7);
        t4.setAbsis(11);
        t4.setOrdinat(17);

        Garis garis1 = new Garis(t1,t2);
        Garis garis2 = new Garis(t3,t4);

        System.out.println("Panjang garis 1: " + garis1.getPanjang());
        System.out.println("Panjang garis 2: " + garis2.getPanjang());

        System.out.println("Gradien garis 1: " + garis1.getGradien());
        System.out.println("Gradien garis 2: " + garis2.getGradien());

        boolean garis = garis1.isTegakLurus(garis2);
        System.out.println("Is tegak lurus?: " + garis );

        Garis refleksigaris2 = garis2.getRefleksiY();
        Garis refleksigaris1 = garis1.getRefleksiY();
        System.out.println("refleksi Y pada garis 2: " + refleksigaris2);
        System.out.println("refleksi Y pada garis 1: " + refleksigaris1);
    }
}
