package Threading.Volatile;

public class VolatileExample {
     boolean flag = false;

    public void run() {
        // Thread 1: Waits until flag becomes true
        new Thread(() -> {
            System.out.println("Waiting for flag to become true...");
            while (!flag) {

                System.out.println(" first Thread 1");
                // busy wait
            }
            System.out.println("Flag is true, exiting...");
        }).start();

        // Thread 2: Sets the flag to true after some time
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag set to true");
        }).start();
    }

    public static void main(String[] args) {
        new VolatileExample().run();
    }
}
