package fr.fms.school;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Director

        Director martial = new Director("Martial", "Bret", 54, new Address("1 rue de la pierre en bois", "Toulouse", 75000 ));

        // Teacher

        Teacher mor = new Teacher("Mor", "Diop", 32, new Address("3 avenue du sablar", "Dax", 40000), LocalDate.of(2025,9,15));

        Teacher fatou = new Teacher("Fatou", "Ba", 29,
                new Address("12 rue des lilas", "Bordeaux", 33000),
                LocalDate.of(2025, 10, 1));

        Teacher jean = new Teacher("Jean", "Martin", 45,
                new Address("5 place de la mairie", "Paris", 75000),
                LocalDate.of(2025, 11, 20));

        Teacher sophie = new Teacher("Sophie", "Durand", 38,
                new Address("8 boulevard Victor Hugo", "Lyon", 69000),
                LocalDate.of(2025, 12, 5));

        Teacher ali = new Teacher("Ali", "Kane", 50,
                new Address("20 chemin des écoles", "Marseille", 13000),
                LocalDate.of(2026, 1, 10));

        // Students

        Student theo = new Student("Theo", "Sarhane", 14,
                new Address("29 rue bourgneuf", "Bayonne", 64100));

        Student lina = new Student("Lina", "Dupont", 13,
                new Address("12 rue Victor Hugo", "Dax", 40100));

        Student adam = new Student("Adam", "Nguyen", 15,
                new Address("5 avenue de la Liberté", "Pau", 64000));

        Student julie = new Student("Julie", "Martin", 14,
                new Address("8 rue des écoles", "Toulouse", 31000));

        Student yassine = new Student("Yassine", "Benali", 13,
                new Address("10 rue des acacias", "Bordeaux", 33000));

        Student claire = new Student("Claire", "Durand", 15,
                new Address("3 place de la mairie", "Paris", 75000));

        Student hugo = new Student("Hugo", "Petit", 14,
                new Address("7 rue des lilas", "Lyon", 69000));

        Student ines = new Student("Ines", "Lopez", 13,
                new Address("15 boulevard des fleurs", "Marseille", 13000));

        Student paul = new Student("Paul", "Rousseau", 14,
                new Address("20 chemin du stade", "Bayonne", 64100));

        Student sara = new Student("Sara", "Diallo", 15,
                new Address("11 rue des jardins", "Montpellier", 34000));

        Student nathan = new Student("Nathan", "Moreau", 13,
                new Address("6 rue du marché", "Nice", 06000));

        Student emma = new Student("Emma", "Fabre", 14,
                new Address("9 rue des peupliers", "Lille", 59000));

        Student lucas = new Student("Lucas", "Garcia", 15,
                new Address("4 avenue des sports", "Bayonne", 64100));

        Student lea = new Student("Lea", "Bernard", 14,
                new Address("2 rue des écoles", "Anglet", 64600));

        Student sofiane = new Student("Sofiane", "Khelifi", 13,
                new Address("18 rue des pins", "Biarritz", 64200));

        Student manon = new Student("Manon", "Robert", 15,
                new Address("22 rue de la gare", "Dax", 40100));

        Student thomas = new Student("Thomas", "Lemoine", 14,
                new Address("14 rue des moulins", "Pau", 64000));

        Student ana = new Student("Ana", "Fernandez", 13,
                new Address("30 rue des artistes", "Bayonne", 64100));

        Student maxime = new Student("Maxime", "Chevalier", 15,
                new Address("25 rue des champs", "Toulouse", 31000));

        Student sophia = new Student("Sophia", "Gonzalez", 14,
                new Address("19 rue des roses", "Bordeaux", 33000));


        martial.addTeacher(mor);
        martial.addTeacher(jean);
        martial.addTeacher(fatou);
        martial.addTeacher(sophie);
        martial.addTeacher(ali);

        theo.applyToSchool();
        lina.applyToSchool();
        adam.applyToSchool();
        julie.applyToSchool();
        yassine.applyToSchool();
        claire.applyToSchool();
        hugo.applyToSchool();

        martial.acceptAllStudents();

        System.out.println(Director.getWaitingToBeSubscribedStudents());

        System.out.println("-------DisplayStudents-------");
        martial.displayStudents();



    }

}
