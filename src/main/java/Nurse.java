public class Nurse extends Personnel {
    private String password;

    public void checkup(String patientNationalID, String doctorNationalID,
                        String date, String sickness, String prescription) {
        Visit v = new Visit(patientNationalID, doctorNationalID, this.NationalID, date, sickness, prescription);
        Hospital.plus(v);
    }

    public Nurse(String password, String salary, String workExperience,
                 String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName, lastName, age, nationalID, gender);
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "WorkExperience='" + WorkExperience + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", NationalID='" + NationalID + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
