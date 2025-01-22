import java.util.ArrayList;
import java.util.List;


public class PatientClass {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Sumit", "Cardiologist");
        Doctor doctor2 = new Doctor("Amit", "Dermatologist");

        // Create patients
        Patient patient1 = new Patient("Kumar", 30);
        Patient patient2 = new Patient("Mr. Mahto", 45);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Patient consultations
        patient1.consult(doctor1);
        patient2.consult(doctor1);
        patient1.consult(doctor2);
    }
}


class Hospital {
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

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        // Communication during consultation
        System.out.println("Dr. " + this.name + " (" + this.specialty + ") is consulting " + patient.getName() + ":");
        System.out.println("Dr. " + this.name + ": Hello " + patient.getName() + ", how can I assist you today?");
        System.out.println(patient.getName() + ": I am feeling unwell, doctor.");
        System.out.println("Dr. " + this.name + ": Let me examine you and provide the best care.\n");
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}

class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public void consult(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
        // Communication during consultation
        System.out.println(this.name + ": I need a consultation with Dr. " + doctor.getName() + ".");
        doctor.consult(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}