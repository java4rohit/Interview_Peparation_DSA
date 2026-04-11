package Threading.ThreadStartAgain.ThreadMethod;

public class InterruptedMethod  extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(10000);
            System.out.println("Thread Is Running...... ");
        } catch (InterruptedException e) {
            System.out.println("Thread Is InTerrupted : "+ e);
        }
    }

    public static void main(String[] args) {

        InterruptedMethod interrupted = new InterruptedMethod();
        interrupted.start();
        interrupted.interrupt();

    }
}
