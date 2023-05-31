import java.util.ArrayList;

public class Patient extends Person {
    public ArrayList<Visit> patientVisits = new ArrayList<>();

    public Patient(String firstName, String lastName, String age, String nationalID, String gender) {
        super(firstName, lastName, age, nationalID, gender);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", NationalID='" + NationalID + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void printAllVisits() {
        for (Visit v : patientVisits) {
            System.out.println(v);
        }
    }

    public void printSicknessVisits(String sickness) {
        for (Visit v : patientVisits) {
            if (v.getSickness().equals(sickness))
                System.out.println(v);
        }
    }
}
