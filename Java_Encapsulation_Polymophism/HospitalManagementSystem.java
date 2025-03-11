package Java_Encapsulation_Polymophism;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing a Patient
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // Encapsulated field
    private String medicalHistory; // Encapsulated field
    private List<String> records = new ArrayList<>(); // Encapsulated field for medical records

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return String.format("Patient ID: %s | Name: %s | Age: %d", patientId, name, age);
    }

    // Getters and setters for encapsulated fields
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Implement addRecord() from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // Implement viewRecords() from MedicalRecord interface
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : records) {
            System.out.println("- " + record);
        }
    }

    // Getter for name field
    public String getName() {
        return name;
    }
}

// InPatient subclass
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    // Constructor
    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    // Implement calculateBill() for InPatient
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    private int numberOfVisits;
    private double visitCharge;

    // Constructor
    public OutPatient(String patientId, String name, int age, int numberOfVisits, double visitCharge) {
        super(patientId, name, age);
        this.numberOfVisits = numberOfVisits;
        this.visitCharge = visitCharge;
    }

    // Implement calculateBill() for OutPatient
    @Override
    public double calculateBill() {
        return numberOfVisits * visitCharge;
    }
}

// MedicalRecord interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Main class to demonstrate the system
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        Patient inPatient = new InPatient("101", "rahul", 30, 5, 500);
        Patient outPatient = new OutPatient("102", "deepak", 25, 3, 200);

        // Set medical records
        inPatient.addRecord("Diagnosis: Fever");
        inPatient.addRecord("Treatment: Antibiotics");

        outPatient.addRecord("Diagnosis: Fracture");
        outPatient.addRecord("Treatment: Physiotherapy");

        // Use polymorphism to handle different patient types
        displayPatientDetails(inPatient);
        displayPatientDetails(outPatient);
    }

    // Polymorphic method to display patient details and billing
    public static void displayPatientDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: $" + patient.calculateBill());
        patient.viewRecords();
        System.out.println();
    }
}