package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// La classe Teacher pour créer les enseignants
public class Teacher extends Person {
    private LocalDate arrivalDate;
    private List<Course> courses;
    private List<Student> students;

    // =======Constructeur ==========
    public Teacher(String firstName, String lastName, int age, Address address, LocalDate arrivalDate) {
        super(firstName, lastName, age, address);
        setArrivalDate(arrivalDate);
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // ===========Les getter et setter==================

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    // =========Les méthodes========
    public void addCourse(Course course) {
        course.setTeacher(this);
        courses.add(course);
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
        return "Teacher{\n" +
                "Nom: " + getFirstName() + " " + getLastName() +
                "\nDate d'arrivée: " + arrivalDate +
                "\nCours: " + courses +
                "\nElèves: " + students +
                '}';
    }
}
