abstract class Animal implements Flyer {
    // Implementasi metode eat
    void eat() {
        System.out.println("Sedang makan..."); 
    }

    // Implementasi metode toString untuk representasi hewan
    public String toString() {
        return "Saya adalah hewan"; 
    }

    // Implementasi default dari metode interface Flyer
    public void takeOff() {} 
    public void fly() {} 
    public void land() {} 
}
