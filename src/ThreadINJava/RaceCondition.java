package ThreadINJava;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
      Runnable runnable1 = () ->{
          for(int i = 1; i<= 10000 ;i++){
              counter.isIncrement();
          }
      };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

       // System.out.println(counter.count.get());
        System.out.println(counter.count);
    }
}
class Counter{
    //int count = 0;
    volatile int count =  0;
    public void  isIncrement(){
        count++;
      //  count.incrementAndGet();
    }
}
