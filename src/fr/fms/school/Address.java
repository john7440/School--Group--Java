package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String street;
    private String city;
    private String zipCode;
    private List<Person> inhabitants;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.inhabitants = new ArrayList<>();
    }

    public boolean isFormatCodeValid() {
        String zip = String.valueOf(zipCode);
        return zip.matches("\\d{5}");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<Person> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<Person> inhabitants) {
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        return "\nRue: " + street +
                "\nVille: " + city +
                "\nzipCode: " + zipCode;
    }
}
