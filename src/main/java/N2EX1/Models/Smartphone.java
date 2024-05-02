package N2EX1.Models;

import N2EX1.Models.Interfaces.Camara;
import N2EX1.Models.Interfaces.Clock;

public class Smartphone extends Phone implements Camara, Clock {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void shoot() {
        System.out.println("Taking a picture");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }

}
