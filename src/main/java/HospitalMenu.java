import java.util.Objects;
import java.util.Scanner;

public class HospitalMenu {
    static Hospital hospital;

    public HospitalMenu(Hospital h) {
        hospital = h;
    }

    public static void showMenu() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Who are you?");
            System.out.println("1. Owner");
            System.out.println("2. Doctor");
            System.out.println("3. Nurse");
            int role = scannerI.nextInt();

            if (role == 1) {
                System.out.println("Please enter your password:");
                String password = scanner.nextLine();

                if (password.equals(hospital.getOwnerPassword())) {
                    System.out.println("Welcome, owner!");
                    boolean ownerMenuRunning = true;

                    while (ownerMenuRunning) {
                        System.out.println("What do you want to do?");
                        System.out.println("1. add doctor");
                        System.out.println("2. delete doctor");
                        System.out.println("3. add nurse");
                        System.out.println("4. delete nurse");
                        System.out.println("5. add serviceMen");
                        System.out.println("6. delete serviceMen");
                        System.out.println("7. change password");
                        int ownerOption = scannerI.nextInt();

                        switch (ownerOption) {
                            case 1: {
                                System.out.println("Enter doctor's first name : ");
                                String firstName = scanner.nextLine();
                                System.out.println("Enter doctor's last name : ");
                                String lastName = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter doctor's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(nationalId);
                                if (o != null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct doctor's NationalID : ");
                                    nationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(nationalId);
                                    if (o2 == null)
                                        correctID = true;
                                }
                                System.out.println("Enter doctor's age : ");
                                String age = scanner.nextLine();
                                System.out.println("Enter doctor's WorkExperience : ");
                                String workExperience = scanner.nextLine();
                                System.out.println("Enter doctor's salary : ");
                                String salary = scanner.nextLine();
                                System.out.println("Enter doctor's Expertise : ");
                                String expertise = scanner.nextLine();
                                System.out.println("Enter doctor's Gender : ");
                                String gender = scanner.nextLine();
                                System.out.println("Enter doctor's password : ");
                                String pass = scanner.nextLine();
                                Hospital.plus(new Doctor(expertise, pass, salary, workExperience, firstName,
                                        lastName, age, nationalId, gender));
                                break;
                            }
                            case 2: {
                                System.out.println("Enter doctor's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Hospital.delete(Hospital.getByNationalID(nationalId));
                                break;
                            }
                            case 3: {
                                System.out.println("Enter nurse's first name : ");
                                String firstName = scanner.nextLine();
                                System.out.println("Enter nurse's last name : ");
                                String lastName = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter nurse's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(nationalId);
                                if (o != null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct doctor's NationalID : ");
                                    nationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(nationalId);
                                    if (o2 == null)
                                        correctID = true;
                                }
                                System.out.println("Enter nurse's age : ");
                                String age = scanner.nextLine();
                                System.out.println("Enter nurse's WorkExperience : ");
                                String workExperience = scanner.nextLine();
                                System.out.println("Enter nurse's salary : ");
                                String salary = scanner.nextLine();
                                System.out.println("Enter nurse's Gender : ");
                                String gender = scanner.nextLine();
                                System.out.println("Enter nurse's password : ");
                                String pass = scanner.nextLine();
                                Hospital.plus(new Nurse(pass, salary, workExperience, firstName,
                                        lastName, age, nationalId, gender));
                                break;
                            }
                            case 4: {
                                System.out.println("Enter nurse's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Hospital.delete(Hospital.getByNationalID(nationalId));
                                break;
                            }
                            case 5: {
                                System.out.println("Enter serviceMen's first name : ");
                                String firstName = scanner.nextLine();
                                System.out.println("Enter serviceMen's last name : ");
                                String lastName = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter nurse's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(nationalId);
                                if (o != null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct doctor's NationalID : ");
                                    nationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(nationalId);
                                    if (o2 == null)
                                        correctID = true;
                                }
                                System.out.println("Enter serviceMen's age : ");
                                String age = scanner.nextLine();
                                System.out.println("Enter serviceMen's WorkExperience : ");
                                String workExperience = scanner.nextLine();
                                System.out.println("Enter serviceMen's salary : ");
                                String salary = scanner.nextLine();
                                System.out.println("Enter serviceMen's Gender : ");
                                String gender = scanner.nextLine();
                                Hospital.plus(new ServiceMen(salary, workExperience, firstName,
                                        lastName, age, nationalId, gender));
                                break;
                            }
                            case 6: {
                                System.out.println("Enter serviceMen's NationalID : ");
                                String nationalId = scanner.nextLine();
                                Hospital.delete(Hospital.getByNationalID(nationalId));
                                break;
                            }
                            case 7: {
                                System.out.println("Please enter the new password:");
                                String newPassword = scanner.nextLine();
                                hospital.setOwnerPassword(newPassword);
                                System.out.println("Password changed successfully!");
                                break;
                            }
                            default:
                                System.out.println("Invalid option!");
                                break;
                        }
                        while (true) {
                            System.out.println("Do you want to continue as owner ? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int ownerContinue = scanner.nextInt();
                            if (ownerContinue == 1)
                                break;
                            else if (ownerContinue == 2) {
                                ownerMenuRunning = false;
                                break;
                            } else
                                System.out.println("Invalid option !");
                        }
                    }
                } else {
                    System.out.println("Invalid password!");
                }

            } else if (role == 2) {
                System.out.println("Please enter your password:");
                String password = scanner.nextLine();
                Doctor currentDoctor = null;
                boolean exist = false;
                for (Doctor d : Hospital.getDoctors()) {
                    if (d.getPassword().equals(password)) {
                        currentDoctor = d;
                        exist = true;
                        break;
                    }
                }
                if (exist) {
                    System.out.println("Welcome, doctor!");
                    boolean doctorMenuRunning = true;

                    while (doctorMenuRunning) {
                        System.out.println("What do you want to do?");
                        System.out.println("1. visit patient");
                        System.out.println("2. change password");
                        System.out.println("3. delete visit");
                        int doctorOption = scannerI.nextInt();

                        switch (doctorOption) {
                            case 1: {
                                System.out.println("Enter patient's NationalID : ");
                                String patientNationalId = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter nurse's NationalID : ");
                                String nurseNationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(nurseNationalId);
                                if (o == null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct nurse's NationalID : ");
                                    nurseNationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(nurseNationalId);
                                    if (o2 != null)
                                        correctID = true;
                                }
                                System.out.println("Enter date : ");
                                String date = scanner.nextLine();
                                System.out.println("Enter sickness : ");
                                String sickness = scanner.nextLine();
                                System.out.println("Enter prescription : ");
                                String prescription = scanner.nextLine();
                                Hospital.plus(new Visit(patientNationalId, currentDoctor.NationalID,
                                        nurseNationalId, date, sickness, prescription));
                                break;
                            }
                            case 2: {
                                System.out.println("Please enter the new password:");
                                String newPassword = scanner.nextLine();
                                currentDoctor.setPassword(newPassword);
                                System.out.println("Password changed successfully!");
                                break;
                            }
                            case 3: {
                                System.out.println("Enter patient's NationalID : ");
                                String patientNationalId = scanner.nextLine();
                                System.out.println("Enter nurse's NationalID : ");
                                String nurseNationalId = scanner.nextLine();
                                System.out.println("Enter date : ");
                                String date = scanner.nextLine();
                                System.out.println("Enter sickness : ");
                                String sickness = scanner.nextLine();
                                System.out.println("Enter prescription : ");
                                String prescription = scanner.nextLine();
                                Hospital.delete(new Visit(patientNationalId, currentDoctor.NationalID,
                                        nurseNationalId, date, sickness, prescription));
                                break;
                            }
                            default:
                                System.out.println("Invalid option!");
                                break;
                        }
                        while (true) {
                            System.out.println("Do you want to do continue as doctor ? ");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int doctorContinue = scanner.nextInt();
                            if (doctorContinue == 1)
                                break;
                            else if (doctorContinue == 2) {
                                doctorMenuRunning = false;
                                break;
                            } else
                                System.out.println("Invalid option!");
                        }
                    }
                } else {
                    System.out.println("Invalid password!");
                }
            } else if (role == 3) {
                System.out.println("Please enter your password:");
                String password = scanner.nextLine();
                Nurse currentNurse = null;
                boolean exist = false;
                for (Nurse n : Hospital.getNurses()) {
                    if (n.getPassword().equals(password)) {
                        currentNurse = n;
                        exist = true;
                        break;
                    }
                }
                if (exist) {
                    System.out.println("Welcome, nurse!");
                    boolean nurseMenuRunning = true;

                    while (nurseMenuRunning) {
                        System.out.println("What do you want to do?");
                        System.out.println("1. visit patient");
                        System.out.println("2. register patient");
                        System.out.println("3. change password");
                        System.out.println("4. delete visit");
                        System.out.println("5. delete patient");
                        int nurseOption = scannerI.nextInt();

                        switch (nurseOption) {
                            case 1: {
                                System.out.println("Enter patient's NationalID : ");
                                String patientNationalId = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter doctor's NationalID : ");
                                String doctorNationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(doctorNationalId);
                                if (o == null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct doctor's NationalID : ");
                                    doctorNationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(doctorNationalId);
                                    if (o2 != null)
                                        correctID = true;
                                }
                                System.out.println("Enter date : ");
                                String date = scanner.nextLine();
                                System.out.println("Enter sickness : ");
                                String sickness = scanner.nextLine();
                                System.out.println("Enter prescription : ");
                                String prescription = scanner.nextLine();
                                Hospital.plus(new Visit(patientNationalId, doctorNationalId,
                                        currentNurse.NationalID, date, sickness, prescription));
                                break;
                            }
                            case 2: {
                                System.out.println("Enter patient's first name : ");
                                String firstName = scanner.nextLine();
                                System.out.println("Enter patient's last name : ");
                                String lastName = scanner.nextLine();
                                System.out.println("Enter patient's NationalID : ");
                                String nationalId = scanner.nextLine();
                                System.out.println("Enter patient's age : ");
                                String age = scanner.nextLine();
                                System.out.println("Enter patient's Gender : ");
                                String gender = scanner.nextLine();
                                Hospital.plus(new Patient(firstName, lastName, age, nationalId, gender));
                                break;
                            }
                            case 3: {
                                System.out.println("Please enter the new password:");
                                String newPassword = scanner.nextLine();
                                currentNurse.setPassword(newPassword);
                                System.out.println("Password changed successfully!");
                                break;
                            }
                            case 4: {
                                System.out.println("Enter patient's NationalID : ");
                                String patientNationalId = scanner.nextLine();
                                boolean correctID = true;
                                System.out.println("Enter doctor's NationalID : ");
                                String doctorNationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(doctorNationalId);
                                if (o == null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct doctor's NationalID : ");
                                    doctorNationalId = scanner.nextLine();
                                    Object o2 = Hospital.getByNationalID(doctorNationalId);
                                    if (o2 != null)
                                        correctID = true;
                                }
                                System.out.println("Enter date : ");
                                String date = scanner.nextLine();
                                System.out.println("Enter sickness : ");
                                String sickness = scanner.nextLine();
                                System.out.println("Enter prescription : ");
                                String prescription = scanner.nextLine();
                                Hospital.delete(new Visit(patientNationalId, doctorNationalId,
                                        currentNurse.NationalID, date, sickness, prescription));
                                break;
                            }
                            case 5: {
                                boolean correctID = true;
                                System.out.println("Enter patient's NationalID : ");
                                String patientNationalId = scanner.nextLine();
                                Object o = Hospital.getByNationalID(patientNationalId);
                                if (o == null)
                                    correctID = false;
                                while (!correctID) {
                                    System.out.println("Enter correct patient's NationalID : ");
                                    patientNationalId = scanner.nextLine();
                                    o = Hospital.getByNationalID(patientNationalId);
                                    if (o != null)
                                        correctID = true;
                                }
                                Hospital.delete(o);
                                break;
                            }
                            default:
                                System.out.println("Invalid option!");
                                break;
                        }
                        while (true) {
                            System.out.println("Do you want to continue as nurse ?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int continueString = scannerI.nextInt();

                            if (2 == continueString) {
                                nurseMenuRunning = false;
                                break;
                            } else if (1 == continueString) {
                                break;
                            } else {
                                System.out.println("Invalid number!");
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid password!");
                }

            } else {
                System.out.println("Invalid role!");
            }
            while (true) {
                System.out.println("Do you want to continue?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int continueString = scannerI.nextInt();

                if (2 == continueString) {
                    running = false;
                    break;
                } else if (1 == continueString) {
                    break;
                } else {
                    System.out.println("Invalid number!");
                }
            }
        }
    }
}