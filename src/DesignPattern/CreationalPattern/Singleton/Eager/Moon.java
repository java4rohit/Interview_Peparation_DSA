package DesignPattern.CreationalPattern.Singleton.Eager;


//Eager way of creating Singleton Class
public class Moon {
    private static Moon moon = new Moon();
    private Moon() {
    }
    public static Moon getMoon() {
        return moon;
    }
}
