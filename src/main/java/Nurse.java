public class Nurse extends Personnel{
    //    Put Constructor, toString(using Alt+Ins) and getters for all variables
    private Hospital hospital;
    public void checkup(Patient patient, Doctor doctor,String date, String sickness,
                        String prescription,Hospital hospital){
        Visit v = new Visit(doctor,this,patient,date,sickness,prescription);
        hospital.plus(v);
    }
}
