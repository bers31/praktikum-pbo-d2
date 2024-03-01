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

class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(Student s) {
        studentsEnrolled.add(s);
    }

    public void removeStudent(Student s) {
        studentsEnrolled.remove(s);
    }

    public void viewEnrolledStudents() {
        for (Student student : studentsEnrolled) {
            System.out.println(student.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Lecture
        Lecture lecture1 = new Lecture("Dr. Edy Suharto", 35, "Jl. gabahan no 269", "E101");
        Lecture lecture2 = new Lecture("Dr. Benny Nugroho", 40, "Jl Wotgandul no 244", "E100");

        // Create Students
        Student student1 = new Student("Bernardo", 20, "Jl Kepatihan no 237", "S001");
        Student student2 = new Student("Jojo", 19, "Jl. Nias no 211", "S000");

        // Create Courses
        Course course1 = new Course("C001", "Object Oriented Programming", lecture1);
        Course course2 = new Course("C002", "Data Structures", lecture2);

        // Enroll students to courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Input lecture to courses
        lecture1.teachCourse(course1);
        lecture1.teachCourse(course2);
        lecture2.teachCourse(course1);
        lecture2.teachCourse(course2);

        // Add students to courses
        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);
        course2.addStudent(student2);

        // View details
        System.out.println("Courses diajar oleh " + lecture1.getName() + ":");
        lecture1.viewTaughtCourses();

        System.out.println("\nCourses diajar oleh " + lecture2.getName() + ":");
        lecture2.viewTaughtCourses();

        System.out.println("\nStudents enrolled in course " + course1.getCourseName() + ":");
        course1.viewEnrolledStudents();

        System.out.println("\nStudents enrolled in course " + course2.getCourseName() + ":");
        course2.viewEnrolledStudents();

        System.out.println("\nCourses dimasuki oleh " + student1.getName() + ":");
        student1.viewEnrolledCourses();

        System.out.println("\nCourses dimasuki oleh " + student2.getName() + ":");
        student2.viewEnrolledCourses();

        System.out.println("\nDetails " + student1.getName() + ":");
        System.out.println(student1.getDetails());

        System.out.println("\nDetails " + student2.getName() + ":");
        System.out.println(student2.getDetails());

        System.out.println("\nDetails " + lecture1.getName() + ":");
        System.out.println(lecture1.getDetails());

        System.out.println("\nDetails " + lecture2.getName() + ":");
        System.out.println(lecture2.getDetails());

        // Remove student1 from course1
        course1.removeStudent(student1);
        // Remove student2 from course2
        course2.removeStudent(student2);
        
        System.out.println("\nSetelah menghapus " + student2.getName() + " dari " + course2.getCourseName() + ":");
        System.out.println("\nSetelah menghapus " + student1.getName() + " dari " + course1.getCourseName() + ":");
        // View updated details
        System.out.println("\nStudents enrolled in course " + course2.getCourseName() + ":");
        course2.viewEnrolledStudents();
        System.out.println("\nStudents enrolled in course " + course1.getCourseName() + ":");
        course1.viewEnrolledStudents();
    }
}
