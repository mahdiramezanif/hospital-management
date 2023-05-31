public class Person {
    protected String firstName;
    protected String lastName;
    protected String age;
    protected String NationalID;
    protected String gender;
    protected int id;

    public Person(String firstName, String lastName, String age, String nationalID, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        NationalID = nationalID;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }
}
