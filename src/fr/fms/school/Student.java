package fr.fms.school;

import java.util.ArrayList;

public class Student {
    private int id;
    private ArrayList<Course> courses;

    public Student(int id) {
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
