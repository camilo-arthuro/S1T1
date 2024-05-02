package N1EX1.Models;

public class Cuerda extends Instrumento {
    // Constructor
    public Cuerda(String nombre, double precio){
        super(nombre, precio);
    }

    // Metodo general
    public String tocar(){
        return "Está sonando un instrumento de cuerda";
    }
}
