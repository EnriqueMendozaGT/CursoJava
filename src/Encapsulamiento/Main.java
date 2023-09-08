package Encapsulamiento;

public class Main {
    public static void main(String[] args) {
        CrearHechicero();
    }

    private static void CrearHechicero(){
        Personaje hechicero = new Hechicero();

        hechicero.setNombre("Carla");
        hechicero.setEdad(20);
        hechicero.setTextura("Hechicera.png");

        System.out.println("Nombre: "+ hechicero.getNombre());
        System.out.println("Edad: " + hechicero.getEdad());
        System.out.println("Textura: " + hechicero.getTextura());
    }
}
