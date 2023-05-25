public class Visit {
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


    public Visit(int id, String patientFirstName, String patientLastName,
                 String patientNationalID, String patientAge, String patientGender,
                 String doctorFirstName, String doctorLastName, String doctorExpertise,
                 String doctorID, String nurseFirstName, String nurseLastName, String nurseID,
                 String date, String sickness, String prescription) {
        this.id = id;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientNationalID = patientNationalID;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.doctorExpertise = doctorExpertise;
        this.doctorID = doctorID;
        this.nurseFirstName = nurseFirstName;
        this.nurseLastName = nurseLastName;
        this.nurseID = nurseID;
        this.date = date;
        this.sickness = sickness;
        this.prescription = prescription;
    }

    public int getId() {
        return id;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getPatientNationalID() {
        return patientNationalID;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getDoctorExpertise() {
        return doctorExpertise;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getNurseFirstName() {
        return nurseFirstName;
    }

    public String getNurseLastName() {
        return nurseLastName;
    }

    public String getNurseID() {
        return nurseID;
    }

    public String getDate() {
        return date;
    }

    public String getSickness() {
        return sickness;
    }

    public String getPrescription() {
        return prescription;
    }

    public Visit(Doctor doctor, Nurse nurse, Patient patient,
                 String date, String sickness, String prescription) {
//        Get and set the necessary information of the doctor, nurse and patient that is defined. like this:
        doctorFirstName = doctor.getFirstName();
//        Continuation of the constructor:
        this.date = date;
        this.sickness = sickness;
        this.prescription = prescription;
    }

    private void setId(int ID) {
        id = ID;
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
