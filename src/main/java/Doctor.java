public class Doctor extends Personnel{
    //    Put Constructor, toString(using Alt+Ins) and getters for all variables
    private String Expertise;
    private String password;
//    This is so that the employee knows which hospital he belongs to, so when changing the information
//    (such as visiting a patient and giving a prescription), he should change the information of the same
//    hospital.
    private Hospital hospital;
    public void checkup(Patient patient, Nurse nurse,String date, String sickness,
                        String prescription,Hospital hospital){
        Visit v = new Visit(this,nurse,patient,date,sickness,prescription);
        hospital.plus(v);
    }
    public void ChangePassword(String pass){
//        Change the password
    }
}
