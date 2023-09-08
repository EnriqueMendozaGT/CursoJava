package Encapsulamiento;

public class Hechicero extends Personaje{

    private int poder;

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void saludar(){
        System.out.println("Hola");
    }
}
