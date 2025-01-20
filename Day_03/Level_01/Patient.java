public class Patient {
    private static String hospitalName = "City Hospital"; // Static variable shared by all patients
    private static int totalPatients = 0; // Static variable to track total patients
    private final int patientID; // Final variable for unique patient ID
    private String name;
    private int age;
    private String ailment;

    private static int idCounter = 1; // Counter to generate unique patient IDs

    // Constructor
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = idCounter++; // Assign unique ID
        totalPatients++; // Increment total patients
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Static method to check if an object is an instance of Patient
    public static boolean isPatient(Object obj) {
        return obj instanceof Patient;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create patients
        Patient p1 = new Patient("Alice", 30, "Flu");
        Patient p2 = new Patient("Bob", 45, "Fracture");

        // Display total patients
        System.out.println("Total Patients: " + Patient.getTotalPatients());

        // Display details if the object is a Patient
        if (Patient.isPatient(p1)) {
            p1.displayDetails();
        }

        if (Patient.isPatient(p2)) {
            p2.displayDetails();
        }
    }
}