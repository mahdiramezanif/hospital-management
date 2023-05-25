public class Personnel extends Person{

    //    Put toString(using Alt+Ins)
    protected String salary;
    protected String WorkExperience;
    protected int personnelID;


    public Personnel(String salary, String workExperience,
                     String firstName, String lastName, String age, String nationalID, String gender) {
        super(firstName,lastName,age,nationalID,gender);
        this.salary = salary;
        WorkExperience = workExperience;
    }

    private void setId(int ID) {
        personnelID = ID;
    }
    public String getSalary() {
        return salary;
    }

    public String getWorkExperience() {
        return WorkExperience;
    }
}

