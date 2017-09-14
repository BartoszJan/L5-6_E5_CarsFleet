package com.mojafirma;

/**
 * Created by Bartek on 2017-07-25.
 */
public class Main {
    public static void main(String[] args) {
        Personal car1 = new Personal();
        Personal car2 = new Personal();
        Truck car3 = new Truck();
        Truck car4 = new Truck();

        Fleet<Car> fleet1 = new Fleet<>();
        fleet1.addCar(car1);
        fleet1.addCar(car2);
        fleet1.addCar(car3);
        fleet1.addCar(car4);
        fleet1.fleetDrive();
    }
}
