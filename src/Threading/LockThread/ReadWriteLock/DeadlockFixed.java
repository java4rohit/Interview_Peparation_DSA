package Threading.LockThread.ReadWriteLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadlockFixed {

        private final Lock lock1 = new ReentrantLock();
        private final Lock lock2 = new ReentrantLock();

        public void task1() {
            try {
                if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                    System.out.println("Task1 locked lock1");

                    Thread.sleep(50); // simulate work

                    if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Task1 locked lock2");
                        } finally {
                            lock2.unlock();
                        }
                    } else {
                        System.out.println("Task1 could not lock lock2 — avoiding deadlock");
                    }

                    lock1.unlock();
                } else {
                    System.out.println("Task1 could not lock lock1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void task2() {
            try {
                if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                    System.out.println("Task2 locked lock2");

                    Thread.sleep(50); // simulate work

                    if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Task2 locked lock1");
                        } finally {
                            lock1.unlock();
                        }
                    } else {
                        System.out.println("Task2 could not lock lock1 — avoiding deadlock");
                    }

                    lock2.unlock();
                } else {
                    System.out.println("Task2 could not lock lock2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            DeadlockFixed fixed = new DeadlockFixed();

            Thread t1 = new Thread(fixed::task1);
            Thread t2 = new Thread(fixed::task2);

            t1.start();
            t2.start();
        }
}
