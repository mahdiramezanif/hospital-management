import java.sql.*;
public class Database {
        private static String url;
        private static String user = "root";
        private static String password = "mahdi_ramezani1234";

    public static void read() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://127.0.0.1:3306/information";

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet patientRS = stmt.executeQuery("SELECT * FROM patient");

            while (patientRS.next()) {
                String firstName = patientRS.getString("firstName");
                String lastName = patientRS.getString("lastName");
                String age = patientRS.getString("age");
                String nationalID = patientRS.getString("nationalID");
                String gender = patientRS.getString("gender");
                int id = patientRS.getInt("id");

                Patient patient = new Patient(firstName, lastName, age, nationalID, gender);
                patient.setId(id);
                Hospital.plus(patient);
            }
            patientRS.close();

            ResultSet doctorRS = stmt.executeQuery("SELECT * FROM doctor");
            while (doctorRS.next()) {
                String firstName = doctorRS.getString("firstName");
                String lastName = doctorRS.getString("lastName");
                String age = doctorRS.getString("age");
                String nationalID = doctorRS.getString("NationalID");
                String gender = doctorRS.getString("gender");
                String salary = doctorRS.getString("salary");
                String workExperience = doctorRS.getString("workExperience");
                String expertise = doctorRS.getString("expertise");
                String password = doctorRS.getString("password");
                int id = doctorRS.getInt("id");

                Doctor doctor = new Doctor(expertise,password,salary,workExperience,
                        firstName,lastName,age,nationalID,gender);
                doctor.setId(id);
                Hospital.plus(doctor);
            }
            doctorRS.close();

            ResultSet nurseRS = stmt.executeQuery("SELECT * FROM nurse");
            while (nurseRS.next()) {
                String firstName = nurseRS.getString("firstName");
                String lastName = nurseRS.getString("lastName");
                String age = nurseRS.getString("age");
                String nationalID = nurseRS.getString("NationalID");
                String gender = nurseRS.getString("gender");
                String salary = nurseRS.getString("salary");
                String workExperience = nurseRS.getString("workExperience");
                String password = nurseRS.getString("password");
                int id = nurseRS.getInt("id");

                Nurse nurse = new Nurse(password,salary,workExperience,firstName,
                        lastName,age,nationalID,gender);
                nurse.setId(id);
                Hospital.plus(nurse);
            }
            nurseRS.close();

            ResultSet serviceMenRS = stmt.executeQuery("SELECT * FROM servicemen");
            while (serviceMenRS.next()) {
                String firstName = serviceMenRS.getString("firstName");
                String lastName = serviceMenRS.getString("lastName");
                String age = serviceMenRS.getString("age");
                String nationalID = serviceMenRS.getString("NationalID");
                String gender = serviceMenRS.getString("gender");
                String salary = serviceMenRS.getString("salary");
                String workExperience = serviceMenRS.getString("workExperience");
                int id = serviceMenRS.getInt("id");

                ServiceMen serviceMen = new ServiceMen(salary,workExperience,firstName,lastName,
                        age,nationalID,gender);
                serviceMen.setId(id);
                Hospital.plus(serviceMen);
            }
            serviceMenRS.close();

            ResultSet visitRS = stmt.executeQuery("SELECT * FROM visit");
            while (visitRS.next()) {
                String patientNationalID = visitRS.getString("patientNationalID");
                String doctorNationalID = visitRS.getString("doctorNationalID");
                String nurseNationalID = visitRS.getString("nurseNationalID");
                String date = visitRS.getString("date");
                String sickness = visitRS.getString("sickness");
                String prescription = visitRS.getString("prescription");
                int id = visitRS.getInt("id");

                Visit visit = new Visit(patientNationalID,doctorNationalID,
                        nurseNationalID,date,sickness,prescription);
                visit.setId(id);
                Hospital.plus(visit);
            }
            visitRS.close();
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void write(){
                url = "jdbc:mysql://127.0.0.1:3306/information?useSSL=false";

                // Create a connection to the MySQL database
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, password);
                    Statement stmt = conn.createStatement();

                    // Truncate the patient table to remove any existing data
                    stmt.executeUpdate("TRUNCATE TABLE patient");

                    // Insert all patients from the array list into the patient table
                    PreparedStatement patientPS = conn.prepareStatement("INSERT INTO patient(firstName," +
                            " lastName, age, nationalID, gender, id) VALUES (?, ?, ?, ?, ?, ?)");
                    for (Patient p : Hospital.getPatients()) {
                        patientPS.setString(1, p.firstName);
                        patientPS.setString(2, p.lastName);
                        patientPS.setString(3, p.age);
                        patientPS.setString(4, p.NationalID);
                        patientPS.setString(5, p.gender);
                        patientPS.setInt(6, p.id);
                        patientPS.executeUpdate();
                    }

                    // Truncate the doctor table to remove any existing data
                    stmt.executeUpdate("TRUNCATE TABLE doctor");

                    // Insert all doctors from the array list into the patient table
                    PreparedStatement doctorPS = conn.prepareStatement("INSERT INTO doctor(firstName," +
                            " lastName, age, NationalID, gender, salary, workExperience, expertise, password, id)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    for (Doctor d : Hospital.getDoctors()) {
                        doctorPS.setString(1, d.firstName);
                        doctorPS.setString(2, d.lastName);
                        doctorPS.setString(3, d.age);
                        doctorPS.setString(4, d.NationalID);
                        doctorPS.setString(5, d.gender);
                        doctorPS.setString(6, d.getSalary());
                        doctorPS.setString(7, d.getWorkExperience());
                        doctorPS.setString(8, d.getExpertise());
                        doctorPS.setString(9, d.getPassword());
                        doctorPS.setInt(10, d.id);
                        doctorPS.executeUpdate();
                    }

                    // Truncate the nurse table to remove any existing data
                    stmt.executeUpdate("TRUNCATE TABLE nurse");

                    // Insert all nurses from the array list into the patient table
                    PreparedStatement nursePS = conn.prepareStatement("INSERT INTO nurse(firstName," +
                            " lastName, age, NationalID, gender, salary, workExperience, password, id)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    for (Nurse n : Hospital.getNurses()) {
                        nursePS.setString(1, n.firstName);
                        nursePS.setString(2, n.lastName);
                        nursePS.setString(3, n.age);
                        nursePS.setString(4, n.NationalID);
                        nursePS.setString(5, n.gender);
                        nursePS.setString(6, n.getSalary());
                        nursePS.setString(7, n.getWorkExperience());
                        nursePS.setString(8, n.getPassword());
                        nursePS.setInt(9, n.id);
                        nursePS.executeUpdate();
                    }

                    // Truncate the servicemen table to remove any existing data
                    stmt.executeUpdate("TRUNCATE TABLE servicemen");

                    // Insert all servicemens from the array list into the patient table
                    PreparedStatement serviceMenPS = conn.prepareStatement("INSERT INTO serviceMen" +
                            "(firstName,lastName, age, NationalID, gender, salary, workExperience, id)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                    for (ServiceMen s : Hospital.getServiceMens()) {
                        serviceMenPS.setString(1, s.firstName);
                        serviceMenPS.setString(2, s.lastName);
                        serviceMenPS.setString(3, s.age);
                        serviceMenPS.setString(4, s.NationalID);
                        serviceMenPS.setString(5, s.gender);
                        serviceMenPS.setString(6, s.getSalary());
                        serviceMenPS.setString(7, s.getWorkExperience());
                        serviceMenPS.setInt(8, s.id);
                        serviceMenPS.executeUpdate();
                    }

                    // Truncate the visit table to remove any existing data
                    stmt.executeUpdate("TRUNCATE TABLE visit");

                    // Insert all visits from the array list into the patient table
                    PreparedStatement visitPS = conn.prepareStatement("INSERT INTO visit" +
                            "(patientNationalID,doctorNationalID, nurseNationalID, date, sickness," +
                            " prescription, id)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?)");
                    for (Visit v: Hospital.getVisits()) {
                        visitPS.setString(1, v.getPatientNationalID());
                        visitPS.setString(2, v.getDoctorNationalID());
                        visitPS.setString(3, v.getNurseNationalID());
                        visitPS.setString(4, v.getDate());
                        visitPS.setString(5, v.getSickness());
                        visitPS.setString(6, v.getPrescription());
                        visitPS.setInt(7, v.getId());
                        visitPS.executeUpdate();
                    }

                } catch (SQLException | ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }
    }
}