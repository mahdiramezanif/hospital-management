public class Main {
    public static void main(String[] args) {
        Database.read();
        for (Nurse n:Hospital.getNurses()) {
            System.out.println(n);
        }
        HospitalMenu.showMenu();
        Database.write();
    }
}
