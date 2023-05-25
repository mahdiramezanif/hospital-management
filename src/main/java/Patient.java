import java.util.ArrayList;

public class Patient extends Person{
    //    Put Constructor, toString(using Alt+Ins) and getters for all variables
//    This class does not have an setID method
    private ArrayList<Visit> patientVisits = new ArrayList<>();

    public void updateVisits(){
//Insert all the members of the array list visit from the information class into the
// array list patientVisits in this class.
    }
    public void printAllVisits(){
//        First of all, call method updateVisits to update the data.
//        Prints all visits
    }
    public void printSicknessVisits(String sickness){
        //        First of all, call method updateVisits to update the data.
//        Prints all visits that has this sickness
    }
}
