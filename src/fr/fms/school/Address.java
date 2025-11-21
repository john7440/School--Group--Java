package fr.fms.school;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une adresse postale avec ses habitants.
 * Une adresse est composée d'une rue, d'une ville et d'un code postal.
 * Elle maintient également une liste des personnes qui y habitent.
 */
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private List<Person> inhabitants;

    /**
     * Construit une nouvelle adresse avec les informations spécifiées.
     * Initialise automatiquement une liste vide d'habitants.
     *
     * @param street la rue de l'adresse
     * @param city la ville de l'adresse
     * @param zipCode le code postal de l'adresse
     */
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

    /**
     * Retourne une représentation textuelle de l'adresse.
     *
     * @return une chaîne de caractères contenant la rue, la ville et le code postal
     */
    @Override
    public String toString() {
        return "\nRue: " + getStreet() +
                "\nVille: " + getCity() +
                "\nCode Postal: " + getZipCode();
    }
}