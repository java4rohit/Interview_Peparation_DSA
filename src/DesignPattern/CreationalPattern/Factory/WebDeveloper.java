package DesignPattern.CreationalPattern.Factory;

public class WebDeveloper implements   Employee{
    @Override
    public int salary() {
        System.out.println("getting the salary of WebDeveloper ");
        return 20000;
    }
}
