package IBM;

import java.util.Arrays;

public class MaximizeArraySum {
    public static int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr); // Step 1: Sort the array in ascending order

        int i = 0;

        // Step 2: Flip as many negative numbers as possible
        while (i < arr.length && k > 0 && arr[i] < 0) {
            arr[i] = -arr[i];
            i++;
            k--;
        }

        // Step 3: If k is still odd, flip the smallest element again
        if (k % 2 == 1) {
            Arrays.sort(arr); // Re-sort to find smallest element
            arr[0] = -arr[0];
        }

        // Step 4: Calculate the sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
    // Sample usage
    public static void main(String[] args) {
        int[] arr = {-5, -2, -3, 6, 7};
        int k = 3;
        System.out.println(largestSumAfterKNegations(arr, k)); // Output: 23
    }
}
