package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Représente un enseignant dans le système scolaire qui hérite de Person.
 * Un enseignant est caractérisé par une date d'arrivée dans l'établissement,
 * une liste de cours qu'il enseigne et une liste d'étudiants qu'il suit.
 */
public class Teacher extends Person {
    private LocalDate arrivalDate;
    private List<Course> courses;
    private List<Student> students;

    /**
     * Construit un nouvel enseignant avec les informations personnelles et professionnelles spécifiées.
     * Initialise automatiquement des listes vides de cours et d'étudiants.
     *
     */
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

    /**
     * Ajoute un cours à la liste des cours enseignés par cet enseignant.
     * Définit automatiquement cet enseignant comme responsable du cours.
     *
     * @param course le cours à ajouter
     */
    public void addCourse(Course course) {
        course.setTeacher(this);
        courses.add(course);
    }

    /**
     * Affiche dans la console tous les cours enseignés par cet enseignant.
     */
    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    /**
     * Affiche dans la console tous les étudiants suivis par cet enseignant.
     */
    public void displayStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Retourne une représentation textuelle de l'enseignant.
     *
     * @return une chaîne de caractères contenant le nom, la date d'arrivée,
     *         la liste des cours et la liste des étudiants
     */
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