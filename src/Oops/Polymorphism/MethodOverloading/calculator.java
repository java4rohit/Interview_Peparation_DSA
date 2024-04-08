package Oops.Polymorphism.MethodOverloading;

public class calculator {

    public static void main(String[] args) {

        mul(2,5,6);
    }


    public  static  void add(int a , int b){

        int add  = a+b;
        System.out.println(add);

    }

    public  static  void mul(int a , int b,int c) {
        int add  = a+b+c;
        System.out.println(add);
    }


    public  static  void add(int a , int b,int c,int d) {
        int add  = a+b+c+d;
        System.out.println(add);
    }

}
