package LeetCode.EasyLevel;

public class FactorialNumber {

    public static void main(String[] args) {
        int n =6;
        int fact = fact(6);
        System.out.println(fact);
    }

    private static int fact(int n) {

        if(n==0){
           return 1;
        }
        else
            return (n*fact(n-1));
        }



}
