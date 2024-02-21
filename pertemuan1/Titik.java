public class Titik {
    double absis;
    double ordinat;
    static double counterTitik;

    Titik(){
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }
    
    double getOrdinat(){
        return ordinat;
    }

    static double getCounterTitik(){
        return counterTitik;
    }

    void setAbsis(double xx){
        absis=xx;
    }
    
    void setOrdinat(double yy){
        ordinat=yy;
    }

}
