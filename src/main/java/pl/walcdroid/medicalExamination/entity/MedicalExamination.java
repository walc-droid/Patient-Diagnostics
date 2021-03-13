package pl.walcdroid.medicalExamination.entity;


import org.springframework.data.repository.cdi.Eager;
import pl.walcdroid.doctor.entity.Doctor;
import pl.walcdroid.visit.entity.Visit;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


@Entity
@Table
public class MedicalExamination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String description;
    private String date;
    private String location;


    @ManyToMany(fetch = FetchType.EAGER)
    private List<Doctor> doctorList = new ArrayList<>();


    @OneToOne(mappedBy = "medicalExamination",cascade = CascadeType.REMOVE)
    private Visit visit;


    public Long getId() {
        return id;
    }

    public MedicalExamination setId(Long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public MedicalExamination setType(String type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MedicalExamination setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDate() {
        return date;
    }

    public MedicalExamination setDate(String date) {
        this.date = date;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public MedicalExamination setLocation(String location) {
        this.location = location;
        return this;
    }


    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public MedicalExamination setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
        return this;
    }

    public Visit getVisit() {
        return visit;
    }

    public MedicalExamination setVisit(Visit visit) {
        this.visit = visit;
        return this;
    }
    @Transient //dodatkowe pole nie szukane w bazie danych
    public String getDoctorNames () {
        List<String> doctorSurname = doctorList.stream().map(surname -> surname.getSurname()).collect(Collectors.toList());
        return String.join(",", doctorSurname);
    }

}