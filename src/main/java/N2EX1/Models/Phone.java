package N2EX1.Models;

public class Phone {
    // Attributes
    private String brand;
    private String model;

    //Constructor
    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    // General method
    public void call(String phoneNumber){
        System.out.println("Calling the number " + phoneNumber);
    }
}
