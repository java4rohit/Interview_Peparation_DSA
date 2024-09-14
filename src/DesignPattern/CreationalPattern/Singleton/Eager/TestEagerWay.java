package DesignPattern.CreationalPattern.Singleton.Eager;

public class TestEagerWay {

    public static void main(String[] args) {
        Moon  moon1 = Moon.getMoon();
        System.out.println(moon1.hashCode());
        Moon  moon2 = Moon.getMoon();
        System.out.println(moon2.hashCode());
    }
}
