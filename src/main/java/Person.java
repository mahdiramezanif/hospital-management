public class Person {
    protected String firstName;
    protected String lastName;
    protected String age;
    protected String NationalID;
    protected String gender;

    public Person(String firstName, String lastName, String age, String nationalID, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        NationalID = nationalID;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getNationalID() {
        return NationalID;
    }

    public String getGender() {
        return gender;
    }
}
