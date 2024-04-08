package Oops.Polymorphism.MethodOverriding;

public class Duke extends Bike{

    public static void main(String[] args) {
        Bike b = new Duke();//upcasting
        b.run();
    }
}
