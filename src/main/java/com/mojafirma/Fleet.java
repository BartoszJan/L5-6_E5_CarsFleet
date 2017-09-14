package com.mojafirma;
import java.util.ArrayList;

/**
 * Created by Bartek on 2017-07-25.
 */
public class Fleet<T extends Car> {

    private ArrayList<Car> carList = new ArrayList<>();

    void addCar(T auto) {
        carList.add(auto);
    }

    void fleetDrive(){
        for (int i = 0; i < carList.size(); i++)
        carList.get(i).drive();
    }
}
