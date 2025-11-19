package fr.fms.school;

import java.util.ArrayList;

public class Student extends Person {
    private int id;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, int age, Address address, int id, ArrayList<Course> courses) {
        super(firstName, lastName, age, address);
        this.id = id;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", courses=" + courses +
                '}';
    }
}
