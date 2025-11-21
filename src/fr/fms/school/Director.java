package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

// La classe Director qui hérite de Person
public class Director extends Person {
    private final List<Course> courses;
    private final List<Teacher> teachers;
    private final List<Student> students;
    protected static List<Student> waitingToBeSubscribedStudents = new ArrayList<>();

    // ==========Constructeur===========
    public Director(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        //List<Address> addresses = new ArrayList<>();
    }
    /// ------------->Pour la gestion des cours
    // ajouter un cours
    public void addCourse(Course course) {
        courses.add(course);
    }
    // supprimer
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
    // Afficher les cours
    public void displayCourses(){
        for (Course course : getCourses()) {
            System.out.println(course);
        }
    }

    // -------------->Pour les élèves
    public void validateStudentRegistration(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Inscription validée pour : " + student.getFirstName() + " " + student.getLastName());
        }
    }
    public void viewStudentDetails(Student student) {
        System.out.println(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    // gestion des demandes d'inscriptions
    public static List<Student> getWaitingToBeSubscribedStudents() {
        return waitingToBeSubscribedStudents;
    }

    public void acceptAllStudents(){
        this.students.addAll(waitingToBeSubscribedStudents);
        System.out.println("==========================" + students);
        waitingToBeSubscribedStudents.clear();
    }

    // ------------>Gestion des profs
    public void addTeacher(Teacher teacher) {
        getTeachers().add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // affecter un prof à un cours
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        teacher.addCourse(course);
    }

    //assigner un élève à un cours
    public void assignStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }
    
    public void removeStudentFromCourse(Student student, Course course) {
    	course.getStudents().removeIf(stdntFromList -> stdntFromList.equals(student));
    	student.getAssignedCourses().removeIf(courseFromList -> courseFromList.equals(course));
    }
    
    public void removeStudent(Student student) {}

    //Afficher la liste des élèves
    public void displayStudents(){
        for(Student s : getStudents()) {
            System.out.println(s);
        }
    }

    // Affichage basique du directeur
    @Override
    public String toString() {
        return "Directeur: " + getFirstName() + " " + getLastName() ;
    }

}
