package Threading.LockThread;

public class BankAccount0 {

    private int balance = 100;
    // private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " attempting-to withdraw : " + amount);

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " Proceeding With Withdraw......");
            try {
                Thread.sleep(10000);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdraw Remaining balance " + balance);

        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
        }
    }
}
