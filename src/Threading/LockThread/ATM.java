package Threading.LockThread;

public class ATM {

    public static void main(String[] args) {

       BankAccount1 sbi = new BankAccount1();

      //  BankAccount0 sbi = new BankAccount0();

        Runnable runnable = () -> {
                sbi.withdraw(50);
        };


        Thread t1 = new Thread(runnable,"Thread-1");
        Thread t2 = new Thread(runnable,"Thread-2");

        t1.start();
        t2.start();

    }
}
