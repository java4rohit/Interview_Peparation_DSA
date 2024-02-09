package LeetCode.EasyLevel;

public class FibonaciSeries {
   static int a = 0, b=1, c = 0;
    public static void main(String[] args) {
        int  count = 10 ;

        int n0 =0,  n1 = 1, n2 =0;

        for(int  i =0; i<=count ; i++){
             n2 = n0+n1;
            System.out.print(" "+n2);

            n0=n1;
            n1=n2;
        }

        System.out.println("");
        usingRecursion(count);

    }

    private static void usingRecursion(int count) {


        if(count>=1){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;

            usingRecursion(count-1);
        }

    }
}
