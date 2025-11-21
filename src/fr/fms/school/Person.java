package fr.fms.school;

/**
 * Classe abstraite représentant une personne dans le système scolaire.
 * Une personne est caractérisée par un prénom, un nom, un âge et une adresse.
 * Cette classe sert de base pour les classes Student, Teacher et Director.
 * Lors de la création d'une personne, elle est automatiquement ajoutée à la liste
 * des habitants de son adresse.
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    /**
     * Construit une nouvelle personne avec les informations spécifiées.
     * Ajoute automatiquement cette personne à la liste des habitants de l'adresse fournie.
     *
     * @param firstName le prénom de la personne
     * @param lastName le nom de famille de la personne
     * @param age l'âge de la personne
     * @param address l'adresse de résidence de la personne
     */
    protected Person(String firstName, String lastName, int age, Address address) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.address = address;
        this.address.getInhabitants().add(this);
    }

    // ==== les getter et setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Retourne une représentation textuelle de la personne.
     *
     * @return une chaîne de caractères contenant le prénom, le nom, l'âge et l'adresse
     */
    public String toString() {
        return "\nPrénom: " + getFirstName() + "\n" +
                "Nom: " + getLastName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Adresse: " + getAddress() + "\n";
    }
}