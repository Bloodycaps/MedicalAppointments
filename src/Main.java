import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        /*Doctor alejandro = new Doctor("Alejandro", "Veterinario");

        alejandro.addAvailableAppointment(new Date(), "16:00");
        alejandro.addAvailableAppointment(new Date(), "12:00");
        alejandro.addAvailableAppointment(new Date(), "1:00");

        System.out.println(alejandro);

        System.out.println();
        System.out.println();

        Patient patient = new Patient("alejandra", "alejandra@mail.com");

        System.out.println(patient);*/

        User user = new Doctor("Katherin", "Kathe@Kathe.com");
        user.showDataUser();
        User user1 = new Patient("Katherin", "Kathe@Kathe.com");
        user1.showDataUser();

        User user2 = new User("Rosa", "Rosa@rosa.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Chuz Verde");
                System.out.println("Departamento: Pediatria");
            }

        };
        user2.showDataUser();




    }
}
