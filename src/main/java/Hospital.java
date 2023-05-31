import java.util.ArrayList;
import java.util.Objects;

public class Hospital {
    //    Implement getDoctorPasswords and getNursePasswords methods
//    Implement getDoctorByID, getNurseByID, getServiceMenByID and getPatientByNationalID methods
    private static String ownerPassword = "1234";
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<ServiceMen> serviceMens = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Nurse> nurses = new ArrayList<>();
    private static ArrayList<Visit> visits = new ArrayList<>();

    public static void plus(Object o) {
//        Takes an object and checks what it is. It belongs to any list, adds to that list
        if (o instanceof Patient) {
            ((Patient) o).setId((patients.size() + 1));
            patients.add((Patient) o);
        }
        if (o instanceof ServiceMen) {
            ((ServiceMen) o).setId(serviceMens.size() + 1);
            serviceMens.add((ServiceMen) o);
        }
        if (o instanceof Doctor) {
            ((Doctor) o).setId(doctors.size() + 1);
            doctors.add((Doctor) o);
        }
        if (o instanceof Nurse) {
            ((Nurse) o).setId(nurses.size() + 1);
            nurses.add((Nurse) o);
        }
        if (o instanceof Visit) {
            ((Visit) o).setId(visits.size() + 1);
            visits.add((Visit) o);
            Patient p = (Patient) getByNationalID(((Visit) o).getPatientNationalID());
            p.patientVisits.add((Visit) o);
        }
    }

    public static void delete(Object o) {
//        Takes an object and checks what it is. It belongs to any list, remove from that list
        if (o instanceof Patient) {
            if (patients.contains(o)) {
                patients.remove((Patient) o);
                return;
            }
        } else if (o instanceof ServiceMen) {
            if (serviceMens.contains(o)) {
                serviceMens.remove((ServiceMen) o);
                return;
            }
        } else if (o instanceof Doctor) {
            if (doctors.contains(o)) {
                doctors.add((Doctor) o);
                return;
            }
        } else if (o instanceof Nurse) {
            if (nurses.contains(o)) {
                nurses.add((Nurse) o);
                return;
            }
        } else if (o instanceof Visit) {
            Visit visit = (Visit) o;
            boolean exist = false;
            Visit deletVisit = null;
            for (Visit v : visits) {
                if ((v.getPatientNationalID().equals(visit.getPatientNationalID())
                        && (v.getDoctorNationalID().equals(visit.getDoctorNationalID()))
                        && (v.getNurseNationalID().equals(visit.getNurseNationalID()))
                        && (v.getSickness().equals(visit.getSickness()))
                        && (v.getDate().equals(visit.getDate()))
                        && (v.getPrescription().equals(visit.getPrescription())))) {
                    deletVisit = v;
                    exist = true;
                    break;
                }
            }
            if (exist) {
                visits.remove(deletVisit);
                return;
            }
        }
        System.out.println("There is nothing to delete !");
    }

    public static Object getByNationalID(String id) {
        for (Patient p : patients) {
            if (p.NationalID.equals(id))
                return p;
        }
        for (Doctor d : doctors) {
            if (d.NationalID.equals(id))
                return d;
        }
        for (Nurse n : nurses) {
            if (n.NationalID.equals(id))
                return n;
        }
        for (ServiceMen s : serviceMens) {
            if (s.NationalID.equals(id))
                return s;
        }
        return null;
    }

    public static String getOwnerPassword() {
        return ownerPassword;
    }

    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static ArrayList<ServiceMen> getServiceMens() {
        return serviceMens;
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static ArrayList<Nurse> getNurses() {
        return nurses;
    }

    public static ArrayList<Visit> getVisits() {
        return visits;
    }

    public static void setOwnerPassword(String ownerPass) {
        ownerPassword = ownerPass;
    }
}
