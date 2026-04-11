package DesignPattern.Behavioural.ObserverDesignPattern;

public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject();
        //subject.setPrice(20000);


        Observer  observer1 = new Observer("Rohit");
        Observer observer2 = new Observer("Raj");

        subject.add(observer1);
        subject.add(observer2);


        subject.setPrice(3000);

        subject.setPrice(900);

    }
}
