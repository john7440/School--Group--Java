package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int nextid = 1;
    private int id;


    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.id = nextid;
        nextid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //apply to a school, send my profile to the director
    public void applyToSchool(){
        Director.getWaitingToBeSubscribedStudents().add(this);
    }


    @Override
    public String toString() {
        return "\nStudent{" +
                ", id=" + id +
                super.toString() +
                '}';
    }
}
