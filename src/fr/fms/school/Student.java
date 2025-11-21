package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int nextid = 1;
    private int id;
    private List<Course> assignedCourses;


    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        assignedCourses = new ArrayList<>();
        this.id = nextid;
        nextid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Course> getAssignedCourses() {
		return assignedCourses;
	}

	public void setAssignedCourses(List<Course> assignedCourses) {
		this.assignedCourses = assignedCourses;
	}

	//Demande d'inscription (que le directeur doit valider)
    public void applyToSchool(){
        Director.getWaitingToBeSubscribedStudents().add(this);
    }

    //Affichage basique de l'élève
    @Override
    public String toString() {
        return "\n===Student n°"+ id + "===" +
                super.toString() +
                '\n';
    }

    
    
    
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		assignedCourses.add(course);
	}
	
    //afficher la liste des cours de ce eleve
    public void printCourses() {
    	for(Course course : this.assignedCourses) {
    		System.out.println(course.getName() + " dans la salle " + course.getClassroom() + " avec le formateur " + course.getTeacher().getFirstName());
    	}
    }
}
