public class Visit {
    //    Put Constructor, toString(using Alt+Ins) and getters for all variables
    //    Create a setID method that takes an int and sets it as an ID.
    private int id; //It must be unique
    private String patientFirstName;
    private String patientLastName;
    private String patientNationalID;
    private String patientAge;
    private String patientGender;
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorExpertise;
    private String doctorID;
    private String nurseFirstName;
    private String nurseLastName;
    private String nurseID;
    private String date;
    private String sickness;
    private String prescription; //Explanations about
    // the visit that has been done, including the prescribed medicine, the patient's history, etc.

    public Visit(Doctor doctor,Nurse nurse,Patient patient,
                 String date, String sickness, String prescription) {
//        Get and set the necessary information of the doctor, nurse and patient that is defined. like this:
        doctorFirstName = doctor.getFirstName();
//        Continuation of the constructor:
        this.date = date;
        this.sickness = sickness;
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", patientNationalID='" + patientNationalID + '\'' +
                ", patientAge='" + patientAge + '\'' +
                ", patientGender='" + patientGender + '\'' +
                ", doctorFirstName='" + doctorFirstName + '\'' +
                ", doctorLastName='" + doctorLastName + '\'' +
                ", doctorExpertise='" + doctorExpertise + '\'' +
                ", doctorID='" + doctorID + '\'' +
                ", nurseFirstName='" + nurseFirstName + '\'' +
                ", nurseLastName='" + nurseLastName + '\'' +
                ", nurseID='" + nurseID + '\'' +
                ", date='" + date + '\'' +
                ", sickness='" + sickness + '\'' +
                ", prescription='" + prescription + '\'' +
                '}';
    }
}
