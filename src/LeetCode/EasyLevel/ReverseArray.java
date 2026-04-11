package LeetCode.EasyLevel;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
}
