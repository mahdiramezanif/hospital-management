public class Doctor extends Personnel {
    //    Put toString(using Alt+Ins)
    private String Expertise;
    private String password;

    //    This is so that the employee knows which hospital he belongs to, so when changing the information
    //    (such as visiting a patient and giving a prescription), he should change the information of the same
  //    hospital.

    public Doctor(String expertise, String password,String salary, String workExperience,
                  String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName,lastName,age,nationalID,gender);
        Expertise = expertise;
        this.password = password;
    }

    public String getExpertise() {
        return Expertise;
    }

    public String getPassword() {
        return password;
    }

    public void checkup(String patientNationalID, String nurseNationalID,
                        String date, String sickness, String prescription) {
        Visit v = new Visit(patientNationalID,this.NationalID,nurseNationalID,date,sickness,prescription);
        Hospital.plus(v);
    }

    public void ChangePassword(String pass) {
//        Change the password
    }
}
