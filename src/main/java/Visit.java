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
    private String doctorNationalID;
    private String nurseFirstName;
    private String nurseLastName;
    private String nurseNationalID;
    private String date;
    private String sickness;
    private String prescription; //Explanations about
    // the visit that has been done, including the prescribed medicine, the patient's history, etc.


    public Visit(String patientNationalID, String doctorNationalID, String nurseNationalID,
                 String date, String sickness, String prescription) {
        Patient patient = (Patient) Hospital.getByNationalID(patientNationalID);
        Doctor doctor = (Doctor) Hospital.getByNationalID(doctorNationalID);
        Nurse nurse = (Nurse) Hospital.getByNationalID(nurseNationalID);
        this.patientNationalID = patientNationalID;
        this.doctorNationalID = doctorNationalID;
        this.nurseNationalID = nurseNationalID;
        patientFirstName = patient.firstName;
        patientLastName = patient.lastName;
        patientAge = patient.age;
        patientGender = patient.gender;
        doctorFirstName = doctor.firstName;
        doctorLastName = doctor.lastName;
        doctorExpertise = doctor.getExpertise();
        nurseFirstName = nurse.firstName;
        nurseLastName = nurse.lastName;
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

    public String getNurseFirstName() {
        return nurseFirstName;
    }

    public String getNurseLastName() {
        return nurseLastName;
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

    public void setId(int ID) {
        id = ID;
    }

    public String getDoctorNationalID() {
        return doctorNationalID;
    }

    public String getNurseNationalID() {
        return nurseNationalID;
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
                ", nurseFirstName='" + nurseFirstName + '\'' +
                ", nurseLastName='" + nurseLastName + '\'' +
                ", date='" + date + '\'' +
                ", sickness='" + sickness + '\'' +
                ", prescription='" + prescription + '\'' +
                '}';
    }

}
