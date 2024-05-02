package N1EX1.Models;

public class Viento extends Instrumento {
    // Constructor
    public Viento(String nombre, double precio){
        super(nombre, precio);
    }

    {
        super.setNombre("Flauta");
        super.setPrecio(100d);
    }

    // Metodo general
    public String tocar(){
        return "Está sonando un instrumento de viento";
    }
}
