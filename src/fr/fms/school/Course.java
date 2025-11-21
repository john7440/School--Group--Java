package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Représente un cours avec ses informations de base, son enseignant et ses étudiants.
 * Un cours est caractérisé par un nom, une salle de classe, des dates de début et de fin,
 * et peut être associé à un enseignant et une liste d'étudiants.
 */
public class Course {
    private String name;
    private String classroom;
    private Teacher teacher;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Student> students;

    /**
     * Construit un nouveau cours avec toutes les informations spécifiées.
     *
     * @param name le nom du cours
     * @param classroom la salle de classe où se déroule le cours
     * @param teacher l'enseignant responsable du cours
     * @param startDate la date de début du cours
     * @param endDate la date de fin du cours
     * @param students la liste des étudiants inscrits au cours
     */
    public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate, List<Student> students) {
        setName(name);
        setClassroom(classroom);
        setTeacher(teacher);
        setStartDate(startDate);
        setEndDate(endDate);
        this.students = students;
    }

    public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate) {
        setName(name);
        setClassroom(classroom);
        setTeacher(teacher);
        setStartDate(startDate);
        setEndDate(endDate);
        this.students = new ArrayList<>();
    }

    public Course(String name, String classroom, LocalDate startDate, LocalDate endDate) {
        setName(name);
        setClassroom(classroom);
        setStartDate(startDate);
        setEndDate(endDate);
        this.students = new ArrayList<>();
    }

    //Les Getter et Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Ajoute un étudiant au cours et associe automatiquement ce cours à l'étudiant.
     * Cette méthode maintient la bidirectionnalité de la relation entre le cours et l'étudiant.
     *
     * @param student l'étudiant à ajouter au cours
     */
    public void addStudent(Student student) {
        this.students.add(student);
        student.addCourse(this);
    }

    /**
     * Retourne une représentation textuelle du cours.
     *
     * @return une chaîne de caractères contenant le nom, le lieu, les dates et la liste des étudiants
     */
    @Override
    public String toString() {
        return "Cours:" + getName() + "\nLieu: " + getClassroom()  + "\nDébut: " + getStartDate()
                + "\nFin: " + getEndDate() + "\nListe d'élèves: " + getStudents().toString();
    }

}