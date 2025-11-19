package fr.fms.school;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, int age, Address address) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.address = address;
    }

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    // - -Accessors--

    /**
     * Gets the person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the person's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the person's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the person's age
     * If the age is negative, sets it to -1
     */
    public void setAge(int age) {
        if (age < 0) {
            this.age = -1;

        } else {
            this.age = age;
        }

    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // les Methods

    public String toString() {
        String result = "Prénom: " + getFirstName() + "\n" +
                "Nom: " + getLastName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Adresse: " + getAddress() + "\n";
        return result;
    }
}