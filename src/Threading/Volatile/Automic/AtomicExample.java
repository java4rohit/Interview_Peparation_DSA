package Threading.Volatile.Automic;

public class AtomicExample {
    //AtomicInteger count = new AtomicInteger(0);
        int count = 0;
    public  synchronized  void increment() {
        for (int i = 0; i < 100000; i++) {
            //count.incrementAndGet();
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample obj = new AtomicExample();

        Thread t1 = new Thread(() -> obj.increment());
        Thread t2 = new Thread(() -> obj.increment());

        t1.start();
        t2.start();
        t1.join();
        t2.join();

       // System.out.println("Final Count: " + obj.count.get()); // Always 2000 ✅
        System.out.println("Final Count: " + obj.count);

        //write a java code count fibonaic


    }
}
