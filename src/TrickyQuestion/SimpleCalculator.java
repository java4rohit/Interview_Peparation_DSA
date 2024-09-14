package TrickyQuestion;

import java.time.Duration;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) throws InterruptedException {
       // Scanner scanner =new Scanner(System.in);
        long startTime = System.currentTimeMillis();
    	
        //System.out.println(Thread.currentThread());
        int a = 20;
        int b = 10;

        System.out.println(Thread.currentThread());
        System.out.println("add "+add(a,b));

        System.out.println(Thread.currentThread());
        System.out.println("sub "+sub(a,b));

        System.out.println(Thread.currentThread());
        System.out.println("mul "+mul(a,b));

        System.out.println(Thread.currentThread());
        System.out.println("div "+div(a,b));
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Total Time take to complete all the task: "+(endTime-startTime)/1000); 

    }
    public static  int add(int a, int b) throws InterruptedException{
        Thread.sleep(2000);
        return a+b;
    }
    public static  int sub(int a, int b) throws InterruptedException{
    	 Thread.sleep(2000);
        return a-b;
    }
    public static  int mul(int a , int b) throws InterruptedException{
    	Thread.sleep(2000);
        return a*b;
    }
    public static  int div(int a, int b) throws InterruptedException{
    	Thread.sleep(2000);
        return  a/b;
    }

}
