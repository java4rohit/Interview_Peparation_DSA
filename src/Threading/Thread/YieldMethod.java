package Threading.Thread;

public class YieldMethod extends  Thread {

//    public YieldMethod(String name){
//       super(name);
//    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }

    }

    public static void main(String[] args) {

        YieldMethod t1 = new YieldMethod();
        YieldMethod t2 = new YieldMethod();

        t1.start();
        t2.start();
    }
}
