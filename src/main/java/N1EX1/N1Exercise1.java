package N1EX1;

import N1EX1.Models.Cuerda;
import N1EX1.Models.Instrumento;
import N1EX1.Models.Percusion;
import N1EX1.Models.Viento;

public class N1Exercise1 {
    public static void main(String[] args){
        Viento instrumento1 = new Viento("Flauta", 1000);
        Cuerda instrumento2 =  new Cuerda("Guitarra", 200);
        Percusion instrumento3 = new Percusion("Xilófono", 50);

        Instrumento.mostrarInstrumento(instrumento1);

        System.out.println(instrumento1.tocar());
        System.out.println(instrumento2.tocar());
        System.out.println(instrumento3.tocar());
    }
}
