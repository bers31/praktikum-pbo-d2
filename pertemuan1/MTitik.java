public class MTitik{
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik();

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        t3.setAbsis(5);
        t3.setOrdinat(6);

        t4 = new Titik(1.0,2.0);

        System.out.println("Jumlah objek Titik : " + Titik.getCounterTitik());
        
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("t4(" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
    }
}
