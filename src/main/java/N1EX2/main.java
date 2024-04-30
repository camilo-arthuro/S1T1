package N1EX2;

public class main {
    public static void main(String[] args) {
        // Calling the static method
        Car.stop();

        // Calling the no static method
        // We need to create a Car instance
        Car car1 = new Car("Bmw i3", 125);
        car1.accelerate();

    }
}
