public class Personnel extends Person{

    //    Put toString(using Alt+Ins)
    protected String salary;
    protected String WorkExperience;

    public Personnel(String salary, String workExperience,
                     String firstName, String lastName, String age, String nationalID, String gender) {
        super(firstName,lastName,age,nationalID,gender);
        this.salary = salary;
        WorkExperience = workExperience;
    }

    public String getSalary() {
        return salary;
    }
    public String getWorkExperience() {
        return WorkExperience;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "salary='" + salary + '\'' +
                ", WorkExperience='" + WorkExperience + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", NationalID='" + NationalID + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

