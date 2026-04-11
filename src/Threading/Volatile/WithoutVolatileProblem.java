package Threading.Volatile;

public class WithoutVolatileProblem {
    boolean stop = false;

    public void run() {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            while (!stop) {
                // simulate work
            }
            System.out.println("Thread 1 stopped");
        });

        t1.start();

        try {
            Thread.sleep(1000); // give time for t1 to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        stop = true; // Thread 1 may never see this!
        System.out.println("Main thread set stop = true");
    }

    public static void main(String[] args) {
        new WithoutVolatileProblem().run();
    }
}
