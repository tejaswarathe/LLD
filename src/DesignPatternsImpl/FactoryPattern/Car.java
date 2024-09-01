package DesignPatternsImpl.FactoryPattern;

public class Car {
    protected String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void getWebsite() {
        System.out.println("Car Website");
    }

    public void printCarInfo() {
        System.out.println("The car make is: " + make);
        System.out.println("The car model is: " + model);
    }
}
