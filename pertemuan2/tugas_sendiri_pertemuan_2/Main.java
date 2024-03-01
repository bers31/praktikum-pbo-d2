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
