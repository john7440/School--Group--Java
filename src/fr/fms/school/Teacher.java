package fr.fms.school;

import java.time.LocalDate;

public class Teacher extends Person {
    LocalDate arrivalDate;

    public Teacher(String firstName, String lastName, int age, Address address, LocalDate arrivalDate) {
        super(firstName, lastName, age, address);
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "arrivalDate=" + arrivalDate +
                '}';
    }
}
