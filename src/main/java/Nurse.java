public class Nurse extends Personnel{
    //    Put toString(using Alt+Ins)
    //    This is so that the employee knows which hospital he belongs to, so when changing the information
////    (such as visiting a patient and giving a prescription), he should change the information of the same
////    hospital.
    private Hospital hospital;
    private String password;
    public void checkup(Patient patient, Doctor doctor,String date, String sickness,
                        String prescription,Hospital hospital){
        Visit v = new Visit(doctor,this,patient,date,sickness,prescription);
        hospital.plus(v);
    }

    public Nurse(String password, Hospital hospital, String salary, String workExperience,
                 String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName,lastName,age,nationalID,gender);
        this.password = password;
        this.hospital = hospital;
    }
    public void ChangePassword(String pass){
//        Change the password
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getPassword() {
        return password;
    }
}
