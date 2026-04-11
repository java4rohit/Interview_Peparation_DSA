package Threading.ThreadStartAgain.CreateThrea;

public class World1 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("WORLD");
        }
    }
}
