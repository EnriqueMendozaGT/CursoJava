package Encapsulamiento;

public class Personaje {
    private String nombre;
    private int edad;
    private String textura;

    //Crear un setters para establecer y mandar un dato
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    //Crear un setters para obtener un dato
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTextura() {
        return textura;
    }


    private void saludar (){
        System.out.println("Hola");
    }
}