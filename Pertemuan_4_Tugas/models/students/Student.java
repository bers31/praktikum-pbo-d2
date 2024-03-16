package models.students;

import java.util.ArrayList;
import java.util.List;

import models.Person.Person;
import models.course.Course;

public class Student extends Person {
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nStudent ID: " + studentID;
    }
}