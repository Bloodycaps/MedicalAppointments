import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor alejandro = new Doctor("Alejandro", "Veterinario");

        alejandro.addAvailableAppointment(new Date(), "16:00");
        alejandro.addAvailableAppointment(new Date(), "12:00");
        alejandro.addAvailableAppointment(new Date(), "1:00");

        System.out.println(alejandro);

        System.out.println();
        System.out.println();

        Patient patient = new Patient("alejandra", "alejandra@mail.com");

        System.out.println(patient);
    }
}
