package TrickyQuestion.Thread;

public class SimpleCalculator {
    public static void main(String[] args) throws InterruptedException {
       // Scanner scanner =new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        //System.out.println(Thread.currentThread());
        int a = 20;
        int b = 10;


        Runnable runnable0 = ()->{
            try {
                System.out.println("add "+add(a,b));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable1 = ()->{
            try {
                System.out.println("sub "+sub(a,b));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnable2 = ()->{
            try {
                System.out.println("mul "+mul(a,b));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnable3 = ()->{
            try {
                System.out.println("div "+div(a,b));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread addThread = new Thread(runnable0,"addThread");
        Thread subThread = new Thread(runnable1,"subThread");
        Thread mulThread = new Thread(runnable2,"mulThread");
        Thread divThread = new Thread(runnable3,"divThread");

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

        addThread.join();
        subThread.join();
        mulThread.join();
        divThread.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time take to complete all the task: "+(endTime-startTime)/1000);

    }

    public static  int add(int a, int b) throws InterruptedException{
        Thread.sleep(6000);
        return a+b;
    }
    public static  int sub(int a, int b) throws InterruptedException{
        Thread.sleep(4000);
        return a-b;
    }
    public static  int mul(int a , int b) throws InterruptedException{
        Thread.sleep(3000);
        return a*b;
    }
    public static  int div(int a, int b) throws InterruptedException{
        Thread.sleep(5000);
        return  a/b;
    }

}
