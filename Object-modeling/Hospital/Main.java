package Hospital;

public class Main {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("AIIMS");

        Doctor doc1 = new Doctor("Dr. A");
        Doctor doc2 = new Doctor("Dr. B");

        Patient pat1 = new Patient("P1");
        Patient pat2 = new Patient("P2");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        doc1.consult(pat1);
        doc2.consult(pat2);

        hospital.displayDoctors();
        hospital.displayPatients();

    }
}
