import java.util.ArrayList;

public class Hospital {
    //    Put getters for all variables
    private ArrayList<Patient> patients;
    private ArrayList<ServiceMen> serviceMens;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Visit> visits;
    public void plus(Object o){
//        Takes an object and checks what it is. It belongs to any list, adds to that list
        if (o instanceof Patient) {
            patients.add((Patient) o);
        }

        if (o instanceof ServiceMen) {
            //            Find the largest ID in the corresponding array list,
//            add one to it and use the resulting value as the ID in the object's setID method.
            serviceMens.add((ServiceMen) o);
        }

        if (o instanceof Doctor) {
            //            Find the largest ID in the corresponding array list,
//            add one to it and use the resulting value as the ID in the object's setID method.
            doctors.add((Doctor) o);
        }

        if (o instanceof Nurse) {
            //            Find the largest ID in the corresponding array list,
//            add one to it and use the resulting value as the ID in the object's setID method.
            nurses.add((Nurse) o);
        }

        if (o instanceof Visit) {
            //            Find the largest ID in the corresponding array list,
//            add one to it and use the resulting value as the ID in the object's setID method.
            visits.add((Visit) o);
        }
    }
    public void delete(Object t){
//        Like the method above, it takes an object.
//        First, it checks which class that object belongs to.
//        It was related to any class,
//        first it checks whether that object is in the corresponding array list or not,
//        if it is not, it prints the corresponding message and if it is,
//        it deletes that object from that array list.
    }

}
