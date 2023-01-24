package cn.com.snnile.designpattern.factory.simple;

public class CarFactory {

    public static void generateCar(String carType) {
        if ("Audi".equals(carType)) {
            new Audi().run();
        } else if ("Buick".equals(carType)) {
            new Buick().run();
        } else {
            System.out.println("unsupported car type");
        }
    }

    public static void main(String[] args) {
        CarFactory.generateCar("Audi");
        CarFactory.generateCar("Buick");
        CarFactory.generateCar("Honda");
    }

}
