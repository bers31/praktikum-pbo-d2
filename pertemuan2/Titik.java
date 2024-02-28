public class Titik {
    private double absis;
    private double ordinat;
    private static double counterTitik;

    public Titik() {
        counterTitik++;
    }

    public Titik(double a, double b) {
        this.absis=a;
        this.ordinat=b;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static double getCounterTitik() {
        return counterTitik;
    }

    public void setAbsis(double xx) {
        absis = xx;
    }

    public void setOrdinat(double yy) {
        ordinat = yy;
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX() {
       this.ordinat = -ordinat;
    }

    public void refleksiY() {
        this.absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
       return new Titik(-this.absis, this.ordinat);
    }

}
