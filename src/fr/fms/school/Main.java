package fr.fms.school;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director martial = createDirector();

        // Initialisation des enseignants
        List<Teacher> teachers = createTeachers();
        teachers.forEach(martial::addTeacher);

        // Suppression d’un enseignant
        martial.removeTeacher(teachers.get(4)); // Ali

        // Initialisation des cours
        List<Course> courses = createCourses();
        martial.addCourse(courses.get(0)); // UML
        martial.addCourse(courses.get(1)); // BDD
        martial.addCourse(courses.get(2)); // AquaPoney

        martial.assignCourseToTeacher(courses.get(0), teachers.get(0)); // UML -> Mor
        martial.assignCourseToTeacher(courses.get(1), teachers.get(3)); // BDD -> Sophie

        // Suppression du cours AquaPoney
        martial.removeCourse(courses.get(2));

        // Initialisation des élèves
        List<Student> students = createStudents();
        students.forEach(Student::applyToSchool);

        // Validation des inscriptions
        martial.validateStudentRegistration(students.get(14)); // Sophia
        martial.acceptAllStudents();

        System.out.println(Director.getWaitingToBeSubscribedStudents());

        // Affichage des élèves
        System.out.println("-------DisplayStudents-------");
        martial.displayStudents();

        // Assignation des élèves aux cours
        martial.assignStudentToCourse(students.get(0), courses.get(0)); // Theo -> UML
        martial.assignStudentToCourse(students.get(9), courses.get(0)); // Sara -> UML
        martial.assignStudentToCourse(students.get(13), courses.get(0)); // Lea -> UML
        martial.assignStudentToCourse(students.get(14), courses.get(0)); // Sophia -> UML

        martial.assignStudentToCourse(students.get(12), courses.get(1)); // Lucas -> BDD
        martial.assignStudentToCourse(students.get(9), courses.get(1));  // Sara -> BDD
        martial.assignStudentToCourse(students.get(0), courses.get(1));  // Theo -> BDD

        martial.displayCourses();

        // Test d’adresse partagée
        System.out.println("-------DisplayAdresses-------");
        System.out.println(students.get(0).getAddress().getInhabitants());

        // Affichage des cours d’un prof
        System.out.println("----Display Mor courses-------");
        teachers.get(0).displayCourses();

        // Suppression d’un élève d’un cours
        testRemoveStudentFromCourse(martial, students.get(0), courses.get(1));

        // Suppression d’un élève de l’école
        testRemoveStudentFromSchool(martial, students.get(13), courses.get(0));
    }

    // ------------------ Méthodes utilitaires ------------------

    private static Director createDirector() {
        return new Director("Martial", "Bret", 54,
                new Address("1 rue de la pierre en bois", "Toulouse", "75000"));
    }

    private static List<Teacher> createTeachers() {
        return List.of(
                new Teacher("Mor", "Diop", 32, new Address("3 avenue du sablar", "Dax", "40000"), LocalDate.of(2025,9,15)),
                new Teacher("Fatou", "Ba", 29, new Address("12 rue des lilas", "Bordeaux", "33000"), LocalDate.of(2025,10,1)),
                new Teacher("Jean", "Martin", 45, new Address("5 place de la mairie", "Paris", "75150"), LocalDate.of(2025,11,20)),
                new Teacher("Sophie", "Durand", 38, new Address("8 boulevard Victor Hugo", "Lyon", "69000"), LocalDate.of(2025,12,5)),
                new Teacher("Ali", "Kane", 50, new Address("20 chemin des écoles", "Marseille", "13000"), LocalDate.of(2026,1,10))
        );
    }

    private static List<Student> createStudents() {
        Address theoHome = new Address("29 rue Bourgneuf", "Bayonne", "64100");
        return List.of(
                new Student("Theo", "Sarhane", 14, theoHome),
                new Student("Lina", "Dupont", 13, new Address("12 rue Victor Hugo", "Dax", "40100")),
                new Student("Adam", "Nguyen", 15, new Address("5 avenue de la Liberté", "Pau", "64000")),
                new Student("Julie", "Martin", 14, new Address("8 rue des écoles", "Toulouse", "31000")),
                new Student("Yassine", "Benali", 13, theoHome),
                new Student("Claire", "Durand", 15, new Address("3 place de la mairie", "Paris", "75000")),
                new Student("Hugo", "Petit", 14, new Address("7 rue des lilas", "Lyon", "69000")),
                new Student("Ines", "Lopez", 13, new Address("15 boulevard des fleurs", "Marseille", "13000")),
                new Student("Paul", "Rousseau", 14, new Address("20 chemin du stade", "Bayonne", "64100")),
                new Student("Sara", "Diallo", 15, new Address("11 rue des jardins", "Montpellier", "34000")),
                new Student("Nathan", "Moreau", 13, new Address("6 rue du marché", "Nice", "06000")),
                new Student("Emma", "Fabre", 14, new Address("9 rue des peupliers", "Lille", "59000")),
                new Student("Lucas", "Garcia", 15, new Address("4 avenue des sports", "Tamalou", "65202")),
                new Student("Lea", "Bernard", 14, new Address("2 rue des écoles", "Anglet", "64600")),
                new Student("Sophia", "Gonzalez", 14, new Address("19 rue des roses", "Bordeaux", "33000"))
        );
    }

    private static List<Course> createCourses() {
        return List.of(
                new Course("Uml", "Cap", LocalDate.of(2025,11,17), LocalDate.of(2025,11,21)),
                new Course("BDD", "Mezza1", LocalDate.of(2025,11,24), LocalDate.of(2025,11,28)),
                new Course("Aqua Poney", "Piscine", LocalDate.of(2025,12,6), LocalDate.of(2025,12,9))
        );
    }

    private static void testRemoveStudentFromCourse(Director director, Student student, Course course) {
        System.out.println("==========Remove student from course==========");
        System.out.println("-------BEFORE REMOVAL-------");
        student.printCourses();
        course.getStudents().forEach(s -> System.out.println(s.getFirstName()));

        System.out.println("-------REMOVAL-------");
        director.removeStudentFromCourse(student, course);
        student.printCourses();
        course.getStudents().forEach(s -> System.out.println(s.getFirstName()));
    }

    private static void testRemoveStudentFromSchool(Director director, Student student, Course course) {
        System.out.println("==========Remove student from school==========");
        System.out.println("-------BEFORE REMOVAL-------");
        course.getStudents().forEach(s -> System.out.println(s.getFirstName()));

        System.out.println("-------REMOVAL-------");
        director.removeStudent(student);
        course.getStudents().forEach(s -> System.out.println(s.getFirstName()));
    }
}
