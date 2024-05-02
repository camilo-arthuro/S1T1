package N1EX1.Models;

public class Percusion extends Instrumento {
    //Constructor
    public Percusion(String nombre, double precio){
        super(nombre, precio);
    }

    //Metodo general
    public String tocar(){
        return "Está sonando un instrumento de percusión";
    }
}
