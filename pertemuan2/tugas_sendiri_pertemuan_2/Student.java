import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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

    public String getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentID(String studentID) {
        this.studentID=studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public String getDetails() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nStudent ID: " + studentID+
                "\nCourse Enrolled: "+ coursesEnrolled;
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            System.out.println(course.getCourseName());
        }
    }
}
