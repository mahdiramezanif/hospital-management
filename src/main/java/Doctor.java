public class Doctor extends Personnel {
    //    Put toString(using Alt+Ins)
    private String Expertise;
    private String password;

    //    This is so that the employee knows which hospital he belongs to, so when changing the information
    //    (such as visiting a patient and giving a prescription), he should change the information of the same
  //    hospital.
    private Hospital hospital;

    public Doctor(String expertise, String password, Hospital hospital, String salary, String workExperience,
                  String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName,lastName,age,nationalID,gender);
        Expertise = expertise;
        this.password = password;
        this.hospital = hospital;
    }

    public String getExpertise() {
        return Expertise;
    }

    public String getPassword() {
        return password;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void checkup(Patient patient, Nurse nurse, String date, String sickness,
                        String prescription, Hospital hospital) {
        Visit v = new Visit(this, nurse, patient, date, sickness, prescription);
        hospital.plus(v);
    }

    public void ChangePassword(String pass) {
//        Change the password
    }
}
