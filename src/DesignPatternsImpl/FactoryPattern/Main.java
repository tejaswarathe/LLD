package DesignPatternsImpl.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car myCar = carFactory.getCar("VolksWagon", "Virtus");

        myCar.getWebsite();
        myCar.printCarInfo();

    }
}
