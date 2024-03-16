package models.lecture;

import java.util.ArrayList;
import java.util.List;

import models.Person.Person;
import models.course.Course;

public class Lecture extends Person {
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nEmployee ID: " + employeeID;
    }
}