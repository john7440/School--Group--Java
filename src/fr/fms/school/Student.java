package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int nextId = 1;
    private int id;
    private final List<Course> assignedCourses;

    // ==== Constructeur ====
    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        assignedCourses = new ArrayList<>();
        this.id = nextId;
        nextId++;
    }

    public List<Course> getAssignedCourses() {
		return assignedCourses;
	}
    // ===Les méthodes====
	//Demande d'inscription (que le directeur doit valider)
    public void applyToSchool(){
        Director.getWaitingToBeSubscribedStudents().add(this);
    }

    public void addCourse(Course course) {
        assignedCourses.add(course);
    }

    //afficher la liste des cours pour cet élève
    public void printCourses() {
        for(Course course : this.assignedCourses) {
            System.out.println(course.getName() + " dans la salle " + course.getClassroom() + " avec le formateur " + course.getTeacher().getFirstName());
        }
    }

    //Affichage basique de l'élève
    @Override
    public String toString() {
        return "\n===Student n°"+ id + "===" +
                super.toString() +
                '\n';
    }
}
