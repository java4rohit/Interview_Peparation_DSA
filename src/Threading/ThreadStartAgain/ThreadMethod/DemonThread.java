package Threading.ThreadStartAgain.ThreadMethod;


/*
Demon Thread is BackGround Task that support User Name get Finesh ! Gc is example of Demon thread
No need to stop demon Thread JVM  will stop demon once user thread exceution is completed
 */
public class DemonThread extends  Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {

        DemonThread t1 = new DemonThread();
        t1.setDaemon(true);
        t1.start();

        System.out.println("ATM Done");
    }
}
