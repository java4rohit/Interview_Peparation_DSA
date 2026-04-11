package Threading.Volatile;

public class VolatileCounterExample {
     int count = 0;

    public void increment() {
        count++; // Not atomic: read -> add -> write
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounterExample counter = new VolatileCounterExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });



        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        System.out.println(counter.count);
        t2.join();
        System.out.println(counter.count);

        System.out.println("Final count (volatile): " + counter.count); // ❌ Expected: 2000, But output may be < 2000
    }
}
