package Threading.ThreadStartAgain.ThreadMethod;

public class SetPriorityMethod extends Thread {

    public SetPriorityMethod(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority : "+ Thread.currentThread().getPriority() + " -Count : "+ i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {

        SetPriorityMethod low = new SetPriorityMethod("low Priority Thread ");
        SetPriorityMethod mid = new SetPriorityMethod("mid Priority Thread");
        SetPriorityMethod high = new SetPriorityMethod("high Priority Thread");
        low.setPriority(Thread.MIN_PRIORITY);
        mid.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        mid.start();
        high.start();



    }
}
