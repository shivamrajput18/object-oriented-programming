package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayDoctors() {
        System.out.println("Hospital: " + name);
        for (Doctor doc : doctors) {
            System.out.println(doc.getName());
        }
    }   

    public void displayPatients() {
        System.out.println("Hospital: " + name);
        for (Patient pat : patients) {
            System.out.println(pat.getName());
        }
    }

}
