package MultiThreading.EvenAndOdd;

import java.io.ObjectStreamException;

public class EvenAndOddPrintBy2Thread implements  Runnable{

    int count=1;
  Object object;

    public EvenAndOddPrintBy2Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (count<=10){
            if(count%2==0){
                synchronized (object){
                    System.out.println("Even : " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if(count%2!=0){
                synchronized (object){
                    System.out.println("ODD :: " + count);
                    count++;
                        object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();
        EvenAndOddPrintBy2Thread  n1 = new EvenAndOddPrintBy2Thread(lock);
        Thread t1 = new Thread(n1);
        t1.start();

        Thread t2 = new Thread(n1);
        t2.start();

    }
}
