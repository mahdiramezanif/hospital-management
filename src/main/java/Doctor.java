public class Doctor extends Personnel{
    //    Put Constructor, toString(using Alt+Ins) and getters for all variables
    private String Expertise;
    private Hospital hospital;
    public void checkup(Patient patient, Nurse nurse,String date, String sickness,
                        String prescription,Hospital hospital){
        Visit v = new Visit(this,nurse,patient,date,sickness,prescription);
        hospital.plus(v);
    }
}
