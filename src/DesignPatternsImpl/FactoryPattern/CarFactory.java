package DesignPatternsImpl.FactoryPattern;

import java.util.Objects;

public class CarFactory {

    public Car getCar(String carMake, String carModel) {
        if (Objects.equals(carMake, "VolksWagon")) return new VolkswagonCar(carModel);
        if (Objects.equals(carMake, "Skoda")) return new SkodaCar(carModel);
        return null;

    }
}
