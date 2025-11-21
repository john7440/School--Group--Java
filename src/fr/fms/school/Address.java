package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

// La classe Address qui créer les objets address
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private List<Person> inhabitants;

    // ============Constructeur==================
    public Address(String street, String city, String zipCode) {
        setStreet(street);
        setCity(city);
        setZipCode(zipCode);
        setInhabitants(new ArrayList<>());
    }

    // ============ Les getter et setter==============
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

    // ===========les méthodes=================

    // pour la validation du zipcode
    // (pas encore utilisé)

    //public boolean isFormatCodeValid() {
    //    String zip = String.valueOf(zipCode);
    //    return zip.matches("\\d{5}");
    //}

    // l'affichage de base
    @Override
    public String toString() {
        return "\nRue: " + getStreet() +
                "\nVille: " + getCity() +
                "\nzipCode: " + getZipCode();
    }
}
