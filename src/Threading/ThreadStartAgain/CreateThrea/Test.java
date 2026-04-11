package Threading.ThreadStartAgain.CreateThrea;

public class Test {
    public static void main(String[] args) {

          World1 world = new World1();

          Thread thread = new Thread(world);
          thread.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("HELLO");
        }
    }
}
