public class FullTimeEmployee extends Employee implements WorkSchedule {
    double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displaySchedule() {
        System.out.println("Full-Time Employee Schedule: Senin sampai jumat pukul 08.00-16.00");
    }
}