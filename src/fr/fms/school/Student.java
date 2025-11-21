package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un étudiant dans le système scolaire qui hérite de Person.
 * Chaque étudiant possède un identifiant unique généré automatiquement et
 * une liste de cours auxquels il est inscrit. Les étudiants peuvent soumettre
 * des demandes d'inscription qui doivent être validées par le directeur.
 */
public class Student extends Person {
    private static int nextId = 1;
    private int id;
    private final List<Course> assignedCourses;

    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        assignedCourses = new ArrayList<>();
        this.id = nextId;
        nextId++;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    /**
     * Soumet une demande d'inscription à l'établissement scolaire.
     * L'étudiant est ajouté à la liste d'attente des inscriptions qui devront
     * être validées par le directeur.
     */
    public void applyToSchool(){
        Director.getWaitingToBeSubscribedStudents().add(this);
    }

    /**
     * Ajoute un cours à la liste des cours assignés à cet étudiant.
     *
     * @param course le cours à ajouter
     */
    public void addCourse(Course course) {
        assignedCourses.add(course);
    }

    /**
     * Affiche dans la console la liste de tous les cours assignés à cet étudiant.
     * Pour chaque cours, affiche le nom du cours, la salle de classe et le prénom de l'enseignant.
     */
    public void printCourses() {
        for(Course course : this.assignedCourses) {
            System.out.println(course.getName() + " dans la salle " + course.getClassroom() + " avec le formateur " + course.getTeacher().getFirstName());
        }
    }

    /**
     * Retourne une représentation textuelle de l'étudiant.
     *
     * @return une chaîne de caractères contenant l'identifiant et les informations personnelles de l'étudiant
     */
    @Override
    public String toString() {
        return "\n===Student n°"+ id + "===" +
                super.toString() +
                '\n';
    }
}