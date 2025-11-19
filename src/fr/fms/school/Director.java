package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Director extends Person {
    private List<Course> courses;

    public Director(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.courses = new ArrayList<>();
    }

    //ajouter
    public void addCourse(Course course) {
        courses.add(course);
    }
    // supprimer
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    //afficher
    public List<Course> getCourses() {
        return courses;
    }

    // affecter un prof
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        teacher.getCourses().add(course);
    }

    //assigner eun élève
    public void assignStudentToTeacher(Student student, Teacher teacher) {
        teacher.getStudents().add(student);
    }

    @Override
    public String toString() {
        return "Director{" +
                "name=" + getFirstName() + " " + getLastName() +
                ", courses=" + courses +
                '}';
    }
}
