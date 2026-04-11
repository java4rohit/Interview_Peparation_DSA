package Threading.ThreadStartAgain.ThreadMethod;

public class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread   = new MyThread();
        thread.start();
       // thread.join();
        System.out.println("main completed");
    }
}
