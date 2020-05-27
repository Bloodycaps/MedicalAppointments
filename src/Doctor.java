public class Doctor {
    //Atributos
    static int id = 0;//autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del doctor es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor: "+ id);
    }

}
