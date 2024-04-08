package Oops.Polymorphism.MethodOverriding;

class Splendor extends Bike {

  @Override
  void run(){
    System.out.println("running 60km");
  }
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
} 