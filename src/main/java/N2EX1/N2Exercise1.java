package N2EX1;

import N2EX1.Models.Smartphone;

public class N2Exercise1 {
    public static void main(String[] args) {
        // Crating the Smartphone
        Smartphone phone1 = new Smartphone("Apple","iPhone 14");
        phone1.call("631564507");
        phone1.shoot();
        phone1.alarm();
    }
}
