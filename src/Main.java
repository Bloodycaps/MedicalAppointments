import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor alejandro = new Doctor("Alejandro", "Veterinario");

        alejandro.addAvailableAppointment(new Date(), "16:00");
        alejandro.addAvailableAppointment(new Date(), "12:00");
        alejandro.addAvailableAppointment(new Date(), "1:00");

        for (Doctor.AvailableAppointment aA :
                alejandro.getAvailableAppointments()) {
            System.out.println(aA.getDate().toLocaleString() + " " + aA.getTime());
        }

        Patient patient = new Patient("alejandra", "alejandra@mail.com");

        System.out.println(patient);
    }
}
