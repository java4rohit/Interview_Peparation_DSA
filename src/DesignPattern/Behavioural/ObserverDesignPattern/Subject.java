package DesignPattern.Behavioural.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

   private int price;

   private List<Observer> observerList = new ArrayList<>();

    public void setPrice(int price) {
        this.price = price;
        notifyAllObserver();
    }


    public void add(Observer observer){
        observerList.add(observer);
    }

    private void notifyAllObserver() {

        for (Observer observer : observerList){
            //send updates to each observer regarding the price changes
            System.out.println("sending update to "+observer.getObserverName());
            observer.update(price);

        }
    }

}
