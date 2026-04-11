
package InterviewPrep;

public class FibonacciSeries {
    // Prints the first n Fibonacci numbers
        public static void fibonacciSeries(int n) {
            int a = 0, b = 1;
            System.out.print(a + " " + b);
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        // write a code sum of 2 number
        // // Call fibonacciSeries method to print first 10 Fibonacci numbers
        fibonacciSeries(10);

    }
}
