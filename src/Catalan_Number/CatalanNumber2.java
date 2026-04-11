package Catalan_Number;

public class CatalanNumber2 {
    public static void main(String[] args) {
        int n = 5; // Change this value to compute a different Catalan number
        System.out.println("Catalan number C(" + n + ") is: " + catalan(n));
    }

    private static int catalan(int n) {

        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2 ; i < dp.length ; i++){
            for(int j = 0 ; j < i ; j++){
                dp[i] = dp[i] + dp[j] * dp[i-j-1];
            }
        }

        return dp[n];
    }


}
