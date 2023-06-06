public class Doctor extends Personnel {
    private String Expertise;
    private String password;

    public Doctor(String expertise, String password, String salary, String workExperience,
                  String firstName, String lastName, String age, String nationalID, String gender) {
        super(salary, workExperience, firstName, lastName, age, nationalID, gender);
        Expertise = expertise;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpertise() {
        return Expertise;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Expertise='" + Expertise + '\'' +
                ", WorkExperience='" + WorkExperience + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", NationalID='" + NationalID + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
