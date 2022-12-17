package cn.com.snnile.designpattern.decorator;

public class SimplePerson implements Person {
    @Override
    public void walk() {
        System.out.println("i am walking... ");
    }
}
