import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Danilo");
        myDoctor.name = "David Fagua";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorDave = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();
    }
}
