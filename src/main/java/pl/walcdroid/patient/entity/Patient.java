package pl.walcdroid.patient.entity;

import org.hibernate.validator.constraints.pl.PESEL;
import org.springframework.format.annotation.NumberFormat;
import pl.walcdroid.visit.entity.Visit;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2 , message = "Minimum size is 2 characters!" )
    private String name;
    @Size(min = 2 , message = "Minimum size is 2 characters!" )
    private String surname;

    //Details
    @NotEmpty(message = "Enter date!")
    private String dateOfBirth;
    @PESEL(message = "Wrong input!")
    private String pesel;
    @Size(min = 3 , message = "Minimum size is 3 characters!" )
    private String city;
    @Size(min = 3 , message = "Minimum size is 3 characters!" )
    private String street;
    @Size(min = 1 , max = 7 , message = "Wrong input!")
    private String zipCode;
    @Size(min = 1 , max = 4 , message = "Wrong input!")
    private String houseNumber;
    @Size(min = 1 , max = 4 , message = "Wrong input!")
    private String apartmentNumber;
    @Pattern(regexp="[\\d]{9}", message = "Wrong input!")
    private String phoneNumber;
    @Email(message = "Wrong input!")
    private String email;

    //Card
    private String symptoms;
    private String comorbidities;
    private String medicines;
    private String injuries;
    private String operations;
    private String drugs;
    private String diagnosis;

    @OneToMany(mappedBy = "patient")
    List<Visit> visitList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Patient setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Patient setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Patient setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getPesel() {
        return pesel;
    }

    public Patient setPesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Patient setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Patient setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Patient setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public Patient setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public Patient setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Patient setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Patient setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public Patient setSymptoms(String symptoms) {
        this.symptoms = symptoms;
        return this;
    }

    public String getComorbidities() {
        return comorbidities;
    }

    public Patient setComorbidities(String comorbidities) {
        this.comorbidities = comorbidities;
        return this;
    }

    public String getMedicines() {
        return medicines;
    }

    public Patient setMedicines(String medicines) {
        this.medicines = medicines;
        return this;
    }

    public String getInjuries() {
        return injuries;
    }

    public Patient setInjuries(String injuries) {
        this.injuries = injuries;
        return this;
    }

    public String getOperations() {
        return operations;
    }

    public Patient setOperations(String operations) {
        this.operations = operations;
        return this;
    }

    public String getDrugs() {
        return drugs;
    }

    public Patient setDrugs(String drugs) {
        this.drugs = drugs;
        return this;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Patient setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    public List<Visit> getVisitList() {
        return visitList;
    }

    public Patient setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
        return this;
    }
}
