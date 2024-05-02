package N1EX2;

public class N1Exercise2 {
    public static void main(String[] args) {
        // Calling the static method
        Car.stop();

        // Calling the non-static method
        // We need to create a Car instance
        Car car1 = new Car("Bmw i3", 125);
        car1.accelerate();

    }
}
