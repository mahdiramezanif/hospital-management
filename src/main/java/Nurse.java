public class Nurse extends Personnel{
    //    Put toString(using Alt+Ins)
    //    This is so that the employee knows which hospital he belongs to, so when changing the information
////    (such as visiting a patient and giving a prescription), he should change the information of the same
////    hospital.
    private String password;
    public void checkup(String patientNationalID, String doctorNationalID,
                        String date, String sickness, String prescription) {
        Visit v = new Visit(patientNationalID,doctorNationalID,this.NationalID,date,sickness,prescription);
        Hospital.plus(v);
    }

    public Nurse(String password, String salary, String workExperience,
                 String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName,lastName,age,nationalID,gender);
        this.password = password;
    }
    public void ChangePassword(String pass){
//        Change the password
    }

    public String getPassword() {
        return password;
    }
}
