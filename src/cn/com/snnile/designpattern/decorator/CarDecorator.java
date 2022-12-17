package cn.com.snnile.designpattern.decorator;

public class CarDecorator {

    private Person person;

    public CarDecorator(Person person) {
        this.person = person;
    }

    public void run() {
        person.walk();
        System.out.println("car is running...");
    }

    public static void main(String[] args) {
        Person simplePerson = new SimplePerson();
        CarDecorator carDecorator = new CarDecorator(simplePerson);
        carDecorator.run();
    }

}
