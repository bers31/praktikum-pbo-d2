public class Garis {
    private Titik awal;
    private Titik akhir;

    public Garis(Titik a, Titik b) {
        this.awal=a;
        this.akhir=b;
    }

    public Titik getAwal() {
        return awal;
    }

    public Titik getAkhir() {
        return akhir;
    }

    public void setAwal(Titik xx) {
        awal = xx;
    }

    public void setAkhir(Titik yy) {
        akhir = yy;
    }

    public double getPanjang() {
        return Math.sqrt(Math.pow(awal.getAbsis()-akhir.getAbsis(), 2) + Math.pow(awal.getOrdinat()-akhir.getOrdinat(), 2));
    }

    public double getGradien() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        if (dx == 0) {
            return Double.POSITIVE_INFINITY; // Garis vertikal, gradien tak terhingga
        } else {
            return dy / dx;
        }
    }

    public Garis getRefleksiY() {
        Titik titikRefleksiAwal = new Titik();
        Titik titikRefleksiAkhir = new Titik();

        titikRefleksiAwal.setAbsis(awal.getAbsis());
        titikRefleksiAwal.setOrdinat(-awal.getOrdinat());

        titikRefleksiAkhir.setAbsis(akhir.getAbsis());
        titikRefleksiAkhir.setOrdinat(-akhir.getOrdinat());

        return new Garis(titikRefleksiAwal, titikRefleksiAkhir);
    }

    public boolean isTegakLurus(Garis garis) {
        double gradien1 = this.getGradien();
        double gradien2 = garis.getGradien();
        
        // Jika salah satu gradien adalah tak terhingga, maka garis tegak lurus jika yang lain bukan nol
        if (Double.isInfinite(gradien1) && gradien2 == 0) {
            return true;
        } else if (Double.isInfinite(gradien2) && gradien1 == 0) {
            return true;
        }
        
        // Garis tegak lurus jika perkalian kedua gradien adalah -1
        return gradien1 * gradien2 == -1;
    }
}
