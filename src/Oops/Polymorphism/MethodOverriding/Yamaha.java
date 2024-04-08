package Oops.Polymorphism.MethodOverriding;

public class Yamaha extends Bike{
    @Override
    void run() {
        super.run();
    }

    public static void main(String[] args) {
        Bike s = new Yamaha();
        s.run();
    }
}
