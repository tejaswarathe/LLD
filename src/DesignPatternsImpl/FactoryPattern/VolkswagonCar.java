package DesignPatternsImpl.FactoryPattern;

public class VolkswagonCar extends Car {

    public VolkswagonCar(String model) {
        super("VolksWagon", model);
    }


    public void getWebsite() {
        System.out.println("https://www.volkswagen.co.in/en.html");
    }
}
