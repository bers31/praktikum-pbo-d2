public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Membuat objek FullTimeEmployee dan PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Alfon", 4000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(201, "Ilham", 15.0, 30);

        // Menampilkan detail karyawan dan jadwal kerja
        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + fullTimeEmployee.id);
        System.out.println("Name: " + fullTimeEmployee.name);
        System.out.println("Monthly Salary: Rp." + fullTimeEmployee.monthlySalary);
        System.out.println("Salary: Rp." + fullTimeEmployee.calculateSalary());
        fullTimeEmployee.displaySchedule();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        System.out.println("ID: " + partTimeEmployee.id);
        System.out.println("Name: " + partTimeEmployee.name);
        System.out.println("Hourly Rate: Rp." + partTimeEmployee.hourlyRate);
        System.out.println("Hours Worked: " + partTimeEmployee.hoursWorked);
        System.out.println("Salary: Rp." + partTimeEmployee.calculateSalary());
        partTimeEmployee.displaySchedule();
    }
}