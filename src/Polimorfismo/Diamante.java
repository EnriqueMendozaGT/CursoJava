package Polimorfismo;

public class Diamante extends Cubo {
    int xp;

    @Override
    public void destruir() {
        System.out.println("Un diamante");
    }
}
