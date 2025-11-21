package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un directeur d'établissement scolaire qui hérite de Person.
 * Le directeur gère les cours, les enseignants, les étudiants et les inscriptions.
 * Il a la responsabilité de valider les inscriptions, d'assigner les cours aux enseignants
 * et aux étudiants, et de gérer l'ensemble des ressources pédagogiques.
 */
public class Director extends Person {
    private final List<Course> courses;
    private final List<Teacher> teachers;
    private final List<Student> students;
    protected static List<Student> waitingToBeSubscribedStudents = new ArrayList<>();

    public Director(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    /**
     * Ajoute un cours à la liste des cours gérés par le directeur.
     *
     * @param course le cours à ajouter
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Supprime un cours de la liste des cours gérés par le directeur.
     *
     * @param course le cours à supprimer
     */
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Affiche tous les cours gérés par le directeur dans la console.
     */
    public void displayCourses(){
        for (Course course : getCourses()) {
            System.out.println(course);
        }
    }

    /**
     * Valide l'inscription d'un étudiant dans l'établissement.
     * Si l'étudiant n'est pas déjà inscrit, il est ajouté à la liste des étudiants
     * et un message de confirmation est affiché.
     *
     * @param student l'étudiant dont l'inscription doit être validée
     */
    public void validateStudentRegistration(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Inscription validée pour : " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Retourne la liste statique des étudiants en attente d'inscription.
     *
     * @return la liste des étudiants en attente de validation d'inscription
     */
    public static List<Student> getWaitingToBeSubscribedStudents() {
        return waitingToBeSubscribedStudents;
    }

    /**
     * Accepte tous les étudiants en attente d'inscription.
     * Transfère tous les étudiants de la liste d'attente vers la liste des étudiants inscrits,
     * puis vide la liste d'attente.
     */
    public void acceptAllStudents(){
        this.students.addAll(waitingToBeSubscribedStudents);
        System.out.println("==========================" + students);
        waitingToBeSubscribedStudents.clear();
    }

    /**
     * Ajoute un enseignant à la liste des enseignants gérés par le directeur.
     *
     * @param teacher l'enseignant à ajouter
     */
    public void addTeacher(Teacher teacher) {
        getTeachers().add(teacher);
    }

    /**
     * Supprime un enseignant de la liste des enseignants gérés par le directeur.
     *
     * @param teacher l'enseignant à supprimer
     */
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Affecte un cours à un enseignant.
     *
     * @param course le cours à affecter
     * @param teacher l'enseignant auquel le cours doit être affecté
     */
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        teacher.addCourse(course);
    }

    /**
     * Assigne un étudiant à un cours.
     *
     * @param student l'étudiant à assigner
     * @param course le cours auquel l'étudiant doit être assigné
     */
    public void assignStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }

    /**
     * Retire un étudiant d'un cours spécifique.
     * Supprime l'étudiant de la liste des participants du cours et
     * supprime le cours de la liste des cours assignés à l'étudiant.
     *
     * @param student l'étudiant à retirer
     * @param course le cours duquel retirer l'étudiant
     */
    public void removeStudentFromCourse(Student student, Course course) {
        course.getStudents().removeIf(stdntFromList -> stdntFromList.equals(student));
        student.getAssignedCourses().removeIf(courseFromList -> courseFromList.equals(course));
    }

    /**
     * Supprime complètement un étudiant de l'établissement.
     * Retire d'abord l'étudiant de tous ses cours avant de le supprimer
     * de la liste générale des étudiants.
     *
     * @param student l'étudiant à supprimer
     */
    public void removeStudent(Student student) {
        //remove student from courses before delete student
        for(Course course : this.courses) {
            this.removeStudentFromCourse(student, course);
        }
        //delete student
        this.students.removeIf(stdntFromList -> stdntFromList.equals(student));
    }

    /**
     * Affiche la liste de tous les étudiants inscrits dans la console.
     */
    public void displayStudents(){
        for(Student s : getStudents()) {
            System.out.println(s);
        }
    }

    /**
     * Retourne une représentation textuelle du directeur.
     *
     * @return une chaîne de caractères contenant le titre, le prénom et le nom du directeur
     */
    @Override
    public String toString() {
        return "Directeur: " + getFirstName() + " " + getLastName() ;
    }

}
