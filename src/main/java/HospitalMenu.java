import java.util.Scanner;

public class HospitalMenu {
    //        In this class, define a menu in the following way: we have a while loop with a true condition.
//        Inside this loop, first we ask the user who they are.
//        If they are the owner of the hospital, we first ask for their password.
//        He can change his password.
//        If the password matches the password value in the information class, they enter the owner's menu,
//        otherwise it gives a warning and returns to the previous menu. In the owner menu, we have options
//        to delete a doctor, add a doctor, delete a nurse, add a nurse, delete an employee, and add an employee.
//        If they are a doctor, we ask for their password, and if their password is among the passwords of
//        the doctor array in the information class, we enter the doctor's menu. In this menu, we have the
//        option to visit a patient, He can change his password or choose to re-enter all his information
//        (except ID), and he can also delete a desired visit. If they are a nurse, we ask for their password,
//        and if their password is among the passwords of the nurse array in the information class,
//        we enter the nurse's menu. In this menu, we have options to visit a patient and register a patient,
//        He can change his password or choose to re-enter all his information (except ID),
//        and he can also delete a desired visit.
    //        Note: If an employee wants to change their information or password, a new object should not be created.
//        Rather, new information should be obtained and this new information updated for the same object.
    Scanner scannerI = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    Hospital hospital;

    public HospitalMenu(Hospital hospital) {
        this.hospital = hospital;
    }
    while(running){
        System.out.println("Who are you?");
        System.out.println("1. Owner");
        System.out.println("2. Doctor");
        System.out.println("2. Nurse");
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
                        case 1:
                            // add doctor logic here
                            break;
                        case 2:
                            // delete doctor logic here
                            break;
                        case 3:
                            // add nurse logic here
                            break;
                        case 4:
                            // delete nurse logic here
                            break;
                        case 5:
                            // add employee logic here
                            break;
                        case 6:
                            // delete employee logic here
                            break;
                        case 7:
                            System.out.println("Please enter the new password:");
                            String newPassword = scanner.nextLine();
                            hospital.setOwnerPassword(newPassword);
                            System.out.println("Password changed successfully!");
                            break;
                        default:
                            System.out.println("Invalid option!");
                            break;
                    }

                    System.out.println("Do you want to do something else? (yes/no)");
                    String ownerContinue = scanner.nextLine();
                    if ("no".equals(ownerContinue)) {
                        ownerMenuRunning = false;
                    }
                }
            } else {
                System.out.println("Invalid password!");
            }

        } else if (role == 2) {
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            if (hospital.getDoctorPasswords().contains(password)) {
                System.out.println("Welcome, doctor!");
                boolean doctorMenuRunning = true;

                while (doctorMenuRunning) {
                    System.out.println("What do you want to do?");
                    System.out.println("1. visit patient");
                    System.out.println("2. change password");
                    System.out.println("3. delete visit");
                    int doctorOption = scannerI.nextInt();

                    switch (doctorOption) {
                        case 1:
                            // visit patient logic here
                            break;
                        case 2:
                            System.out.println("Please enter the new password:");
                            String newPassword = scanner.nextLine();
//                            changeDoctorPassword
                            System.out.println("Password changed successfully!");
                            break;
                        case 3:
                            // delete visit logic here
                            break;
                        default:
                            System.out.println("Invalid option!");
                            break;
                    }

                    System.out.println("Do you want to do something else? (yes/no)");
                    String doctorContinue = scanner.nextLine();
                    if ("no".equals(doctorContinue)) {
                        doctorMenuRunning = false;
                    }
                }
            } else {
                System.out.println("Invalid password!");
            }

        } else if (role == 3) {
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            if (hospital.getNursePasswords().contains(password)) {
                System.out.println("Welcome, nurse!");
                boolean nurseMenuRunning = true;

                while (nurseMenuRunning) {
                    System.out.println("What do you want to do?");
                    System.out.println("1. visit patient");
                    System.out.println("2. register patient");
                    System.out.println("3. change password");
                    System.out.println("4. delete visit");
                    int nurseOption = scannerI.nextInt();

                    switch (nurseOption) {
                        case 1:
                            // visit patient logic here
                            break;
                        case 2:
                            // register patient logic here
                            break;
                        case 3:
                            System.out.println("Please enter the new password:");
                            String newPassword = scanner.nextLine();
//                            changeNursePassword
                            System.out.println("Password changed successfully!");
                            break;
                        case 4:
                            // delete visit logic here
                            break;
                        default:
                            System.out.println("Invalid option!");
                            break;
                    }

                    while (true){
                        System.out.println("Do you want to continue?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int continueString = scannerI.nextInt();

                        if (2 == continueString) {
                            nurseMenuRunning = false;
                            break;
                        }
                        else if (1 == continueString) {
                            break;
                        }
                        else  {
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
        while (true){
            System.out.println("Do you want to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int continueString = scannerI.nextInt();

            if (2 == continueString) {
                running = false;
                break;
            }
            else if (1 == continueString) {
                break;
            }
            else  {
                System.out.println("Invalid number!");
            }
        }
    }
}
