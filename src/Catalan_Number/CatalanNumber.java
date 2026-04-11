package Catalan_Number;

public class CatalanNumber {

    public static void main(String[] args) {
        int n = 5; // Change this value to compute a different Catalan number
        System.out.println("Catalan number C(" + n + ") is: " + catalan(n));
    }

    private static String catalan(int n) {
        if (n < 0) {
            return "Invalid input";
        }
        if (n == 0 || n == 1) {
            return "1";
        }

        // Using the formula C(n) = (2n)! / ((n + 1)! * n!)
        long result = factorial(2 * n) / (factorial(n + 1) * factorial(n));
        return String.valueOf(result);
    }

    public static long factorial(int n) {

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}
