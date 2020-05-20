public class Doctor {
    //Atributos
    static int id = 0;//autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("El nombre del doctor es: " + name);
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor: "+ id);
    }

}
