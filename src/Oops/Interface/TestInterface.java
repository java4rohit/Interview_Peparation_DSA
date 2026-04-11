package Oops.Interface;

public class TestInterface implements  A, B {



    public static void main(String[] args) {
        B b = new TestInterface();
        b.show();
    }

    @Override
    public void show() {
        A.super.show();
    }
}
