package DesignPattern.Behavioural.Observer;

public interface Subject {
    void subscribe(Observer ob);
    void unsuscribe(Observer ob);

    void notifyChanges();
}
