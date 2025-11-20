package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Director extends Person {
    private List<Course> courses;
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Address> addresses;

    //static
    public static List<Student> waitingToBeSubscribedStudents = new ArrayList<>();


    public Director(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.addresses = new ArrayList<>();
    }
    /// Pour la gestion des cours
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

    public void displayCourses(){
        for (Course course : courses) {
            System.out.println(course);
        }
    }


    // pour les élèves
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

    public static List<Student> getWaitingToBeSubscribedStudents() {
        return waitingToBeSubscribedStudents;
    }

    public static void setWaitingToBeSubscribedStudents(List<Student> waitingToBeSubscribedStudents) {
        Director.waitingToBeSubscribedStudents = waitingToBeSubscribedStudents;
    }

    public void acceptAllStudents(){
        for(Student s : waitingToBeSubscribedStudents){
            this.students.add(s);
        }
        System.out.println("==========================" + students);
        waitingToBeSubscribedStudents.clear();
    }

    // gestion des profs
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void updateTeacher(int index, Teacher teacher) {
        if (index >= 0 && index < teachers.size()) {
            teachers.set(index, teacher);
        }
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // affecter un prof
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        //teacher.getCourses().add(course);
        teacher.addCourse(course);
    }

    //assigner eun élève
    public void assignStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }

    public void displayStudents(){
        for(Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "name=" + getFirstName() + " " + getLastName() + "}";
    }


}
