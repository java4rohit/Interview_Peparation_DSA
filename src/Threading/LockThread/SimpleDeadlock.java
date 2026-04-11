package Threading.LockThread;

public class SimpleDeadlock {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void task1() {
        synchronized (lock1) {
            System.out.println("Task1 locked lock1");

            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (lock2) {
                System.out.println("Task1 locked lock2");
            }
        }
    }

    public void task2() {
        synchronized (lock2) {
            System.out.println("Task2 locked lock2");

            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (lock1) {
                System.out.println("Task2 locked lock1");
            }
        }
    }

    public static void main(String[] args) {
        SimpleDeadlock simple = new SimpleDeadlock();

        Thread t1 = new Thread(simple::task1);
        Thread t2 = new Thread(simple::task2);

        t1.start();
        t2.start();
    }
}
