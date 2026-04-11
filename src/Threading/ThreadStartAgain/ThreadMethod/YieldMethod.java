package Threading.ThreadStartAgain.ThreadMethod;

public class YieldMethod extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();  // it will give the  chnace to other thread
        }
    }

    public static void main(String[] args) {
        YieldMethod yieldMethod1 = new YieldMethod();
        YieldMethod yieldMethod2 = new YieldMethod();
        yieldMethod1.start();
        yieldMethod2.start();
    }
}
