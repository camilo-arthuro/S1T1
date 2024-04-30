package N1EX1;

public abstract class Instrumento {
    // Atributos
    private String nombre;
    private double precio;

    static {
        System.out.println("Este es un mensaje statico");
    }

    // Constructor
    public Instrumento(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    // Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo general
    public abstract String tocar();

    public static void mostrarInstrumento(Instrumento tipoInstrumento){
        System.out.println("Instrumento: " + tipoInstrumento.getNombre() + " | Precio: " + tipoInstrumento.getPrecio());
    }
}
