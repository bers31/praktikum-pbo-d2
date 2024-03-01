import java.util.ArrayList;
import java.util.List;
class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeID(String EmployeeID) {
        this.employeeID = EmployeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public String getDetails() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nEmployee ID: " + employeeID+
                "\nCourse Taught: "+ coursesTaught;
    }

    public void teachCourse(Course c) {
        coursesTaught.add(c);
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }
}