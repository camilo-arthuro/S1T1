package N1EX1;

public class main {
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
