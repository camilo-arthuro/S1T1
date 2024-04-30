package N1EX2;

public class Car {
    //Atributos
    // The static and final variables have to be initialized out of the methods,
    // or we can have an error when running the program
    private static final String BRAND = "Bmw";
    private static String model;
    private final double POWER;

    // We can initialize the static variables as model and the final variables as
    // POWER in the constructor
    public Car(String model, double power) {
        Car.model = model; // This will assign a model for each car and we can change it with the setter
        this.POWER = power; // This will assign the power of the car but we cannot change it
    }
    // Getter
    public static String getModel() {
        return model;
    }

    public double getPOWER() {
        return POWER;
    }

    //Setter
    public static void setModel(String model) {
        Car.model = model;
    }

    // Metodos generales
    public static void stop(){
        System.out.println("The vehicle is braking");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

}
