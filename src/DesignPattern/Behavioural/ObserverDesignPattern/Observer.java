package DesignPattern.Behavioural.ObserverDesignPattern;

public class Observer {

    private int goldPrice;
    private String observerName;

    public Observer(String observerName) {
        this.observerName = observerName;
    }

    public void update(int price) {
        this.goldPrice = price;
        displayLatestGoldPrice();
    }

    public  void displayLatestGoldPrice(){
        System.out.println("The Latest price Gold is : "+this.goldPrice);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public int getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(int goldPrice) {
        this.goldPrice = goldPrice;
    }
}
