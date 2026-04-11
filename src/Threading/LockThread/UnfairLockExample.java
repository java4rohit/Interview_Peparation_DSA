package Threading.LockThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {

    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource() {
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " : acquired the lock");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " : released the local");
            unfairLock.unlock();
        }
    }
    public static void main(String[] args) {

        UnfairLockExample unfairLockExample = new UnfairLockExample();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                unfairLockExample.accessResource();
            }
        };

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");
        Thread thread3 = new Thread(runnable, "Thread-3");
        Thread thread4= new Thread(runnable, "Thread-4");


        thread1.start();
        thread4.start();
        thread2.start();
        thread3.start();

    }


}
