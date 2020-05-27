import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor alejandro = new Doctor("Alejandro", "Veterinario");
        System.out.println(alejandro.name);
        System.out.println(alejandro.speciality);

        Patient patient = new Patient("David", "david@mail.com");

        patient.setHeight(54.6);
        System.out.println(patient.getHeight());

    }
}
