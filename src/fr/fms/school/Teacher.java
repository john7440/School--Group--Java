package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private LocalDate arrivalDate;
    private List<Course> courses;
    private List<Student> students;

    public Teacher(String firstName, String lastName, int age, Address address, LocalDate arrivalDate) {
        super(firstName, lastName, age, address);
        this.arrivalDate = arrivalDate;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public void addCourse(Course course) {
        course.setTeacher(this);
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void displayStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + getFirstName() + " " + getLastName() +
                ", arrivalDate=" + arrivalDate +
                ", courses=" + courses +
                ", students=" + students +
                '}';
    }
}
