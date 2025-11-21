package fr.fms.school;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Le Directeur
        Director martial = new Director("Martial", "Bret", 54, new Address("1 rue de la pierre en bois", "Toulouse", "75000" ));

        // Les Profs
        Teacher mor = new Teacher("Mor", "Diop", 32, new Address("3 avenue du sablar", "Dax", "40000"), LocalDate.of(2025,9,15));

        Teacher fatou = new Teacher("Fatou", "Ba", 29,
                new Address("12 rue des lilas", "Bordeaux", "33000"),
                LocalDate.of(2025, 10, 1));

        Teacher jean = new Teacher("Jean", "Martin", 45,
                new Address("5 place de la mairie", "Paris", "75150"),
                LocalDate.of(2025, 11, 20));

        Teacher sophie = new Teacher("Sophie", "Durand", 38,
                new Address("8 boulevard Victor Hugo", "Lyon", "69000"),
                LocalDate.of(2025, 12, 5));

        Teacher ali = new Teacher("Ali", "Kane", 50,
                new Address("20 chemin des écoles", "Marseille", "13000"),
                LocalDate.of(2026, 1, 10));

        // Les élèves
        Address theoHome =  new Address("29 rue bourgneuf", "Bayonne", "64100");
        Student theo = new Student("Theo", "Sarhane", 14,
                theoHome);

        Student lina = new Student("Lina", "Dupont", 13,
                new Address("12 rue Victor Hugo", "Dax", "40100"));

        Student adam = new Student("Adam", "Nguyen", 15,
                new Address("5 avenue de la Liberté", "Pau", "64000"));

        Student julie = new Student("Julie", "Martin", 14,
                new Address("8 rue des écoles", "Toulouse", "31000"));

        Student yassine = new Student("Yassine", "Benali", 13,
                theoHome);

        Student claire = new Student("Claire", "Durand", 15,
                new Address("3 place de la mairie", "Paris", "75000"));

        Student hugo = new Student("Hugo", "Petit", 14,
                new Address("7 rue des lilas", "Lyon", "69000"));

        Student ines = new Student("Ines", "Lopez", 13,
                new Address("15 boulevard des fleurs", "Marseille", "13000"));

        Student paul = new Student("Paul", "Rousseau", 14,
                new Address("20 chemin du stade", "Bayonne", "64100"));

        Student sara = new Student("Sara", "Diallo", 15,
                new Address("11 rue des jardins", "Montpellier", "34000"));

        Student nathan = new Student("Nathan", "Moreau", 13,
                new Address("6 rue du marché", "Nice", "06000"));

        Student emma = new Student("Emma", "Fabre", 14,
                new Address("9 rue des peupliers", "Lille", "59000"));

        Student lucas = new Student("Lucas", "Garcia", 15,
                new Address("4 avenue des sports", "Tamalou", "65202"));

        Student lea = new Student("Lea", "Bernard", 14,
                new Address("2 rue des écoles", "Anglet", "64600"));

        Student sophia = new Student("Sophia", "Gonzalez", 14,
                new Address("19 rue des roses", "Bordeaux", "33000"));


        // initiation Cours
        Course uml = new Course("Uml", "Cap", LocalDate.of(2025,11,17),LocalDate.of(2025,11,21));
        Course bdd = new Course("BDD", "Mezza1", LocalDate.of(2025,11,24),LocalDate.of(2025,11,28));
        Course aquaPoney = new Course("Aqua Poney", "Piscine",  LocalDate.of(2025,12,6),LocalDate.of(2025,12,9));

        // Le directeur ajoute les professeurs
        martial.addTeacher(mor);
        martial.addTeacher(jean);
        martial.addTeacher(fatou);
        martial.addTeacher(sophie);
        martial.addTeacher(ali);

        // Suppression d'ali de la liste des profs
        martial.removeTeacher(ali);

        // assignation du cours uml a mor
        martial.assignCourseToTeacher(uml, mor);

        // demande d'inscriptions de la part des élèves
        theo.applyToSchool();
        lina.applyToSchool();
        adam.applyToSchool();
        julie.applyToSchool();
        yassine.applyToSchool();
        claire.applyToSchool();
        hugo.applyToSchool();
        ines.applyToSchool();
        paul.applyToSchool();
        sara.applyToSchool();
        nathan.applyToSchool();
        emma.applyToSchool();
        lucas.applyToSchool();
        lea.applyToSchool();
        sophia.applyToSchool();
        sophia.applyToSchool();

        //Acceptation d'un seul student
        martial.validateStudentRegistration(sophia);

        //acceptation de tous les students en attente
        martial.acceptAllStudents();

        System.out.println(Director.getWaitingToBeSubscribedStudents());

        // affichage de la liste des élèves
        System.out.println("-------DisplayStudents-------");
        martial.displayStudents();

        // ajout cours uml
        martial.addCourse(uml);

        // ajout + suppression du cours aquaPoney :(
        martial.addCourse(aquaPoney);
        martial.assignCourseToTeacher(aquaPoney, sophie);
        martial.removeCourse(aquaPoney);

        System.out.println("-------DisplayCourseUml-------");
        martial.assignStudentToCourse(theo, uml);
        martial.assignStudentToCourse(sara, uml);
        martial.assignStudentToCourse(lea, uml);
        martial.assignStudentToCourse(sophia, uml);

        // cours bdd
        martial.addCourse(bdd);
        martial.assignStudentToCourse(lucas, bdd);
        martial.assignStudentToCourse(sara, bdd);

        martial.displayCourses();

        // test 2 personnes 1 adresse
        System.out.println("-------DisplayAdresses-------");
        System.out.println(theoHome.getInhabitants());

        // test d'affichage cour d'un prof
        System.out.println("----Display Mor courses-------");
        mor.displayCourses();

    }

}