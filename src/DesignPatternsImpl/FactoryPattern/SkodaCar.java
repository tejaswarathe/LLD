package DesignPatternsImpl.FactoryPattern;

public class SkodaCar extends Car {

    public SkodaCar(String model) {
        super("Skoda", model);
    }

    public void getWebsite() {
        System.out.println("https://www.skoda-auto.co.in/");
    }
}
