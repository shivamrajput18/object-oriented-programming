package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(" " + name + " is consulting " + patient.getName());
    }

    public void displayPatients() {
        System.out.println("Doctor: " + name);
        for (Patient pat : patients) {
            System.out.println(pat.getName());
        }
    }    

    public String getName() {
        return name;
    }

}
