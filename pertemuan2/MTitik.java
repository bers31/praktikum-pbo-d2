public class MTitik {
    public static void main(String[] args) {

        Titik titik1 = new Titik();
        Titik titik2 = new Titik();

        titik1.setAbsis(3);
        titik1.setOrdinat(4);
        titik2.setAbsis(5);
        titik2.setOrdinat(12);

        System.out.println("Absis titik 1: " + titik1.getAbsis());
        System.out.println("Ordinat titik 1: " + titik1.getOrdinat());
        System.out.println("Absis titik 2: " + titik2.getAbsis());
        System.out.println("Ordinat titik 2: " + titik2.getOrdinat());

        System.out.println("Jarak titik 1 ke pusat: " + titik1.getJarakPusat());
        System.out.println("Jarak titik 2 ke pusat: " + titik2.getJarakPusat());

        titik1.refleksiX();
        System.out.println("Absis refleksi X pada titik 1: " + titik1.getAbsis());
        System.out.println("Ordinat refleksi X pada titik 1: " + titik1.getOrdinat());

        titik1.refleksiY();
        System.out.println("Absis refleksi Y pada titik 1: " + titik1.getAbsis());
        System.out.println("Ordinat refleksi Y pada titik 1: " + titik1.getOrdinat());

        titik2.refleksiY();
        System.out.println("Absis refleksi Y pada titik 2: " + titik2.getAbsis());
        System.out.println("Ordinat refleksi Y pada titik 2: " + titik2.getOrdinat());

        titik2.refleksiX();
        System.out.println("Absis refleksi X pada titik 2: " + titik2.getAbsis());
        System.out.println("Ordinat refleksi X pada titik 2: " + titik2.getOrdinat());
        
        // Titik test = titik2.getRefleksiX();
        // System.out.printf("titik test (%.2f, %.2f)", test.getAbsis(), test.getOrdinat());
        System.out.println("Get refleksi X pada titik 2: " + titik2.getRefleksiX().getAbsis());
        System.out.println("Get refleksi Y pada titik 2: " + titik2.getRefleksiY().getOrdinat());

        System.out.println("Get refleksi X pada titik 1: " + titik1.getRefleksiX().getAbsis());
        System.out.println("Get refleksi Y pada titik 1: " + titik1.getRefleksiY().getOrdinat());
    }
}
