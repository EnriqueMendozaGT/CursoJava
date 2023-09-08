package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //Utilizamos el objeto Cubo y lo instanciamos con el carbon
        Cubo carbon1 = new Carbon();
        carbon1.destruir();

        //Utilizamos el objeto Cubo y lo instanciamos con el Diamante
        Cubo diamante1 = new Diamante();
        diamante1.destruir();
    }
}

