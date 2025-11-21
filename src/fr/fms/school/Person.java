package fr.fms.school;

// la classe Person (qui est abstraite) pour créer l'objet Person (utilisé dans Student, Teacher et Director).
public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    // =======Constructeur ==========
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

    // =========== les Méthodes ==========

    public String toString() {
        return "\nPrénom: " + getFirstName() + "\n" +
                "Nom: " + getLastName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Adresse: " + getAddress() + "\n";
    }
}