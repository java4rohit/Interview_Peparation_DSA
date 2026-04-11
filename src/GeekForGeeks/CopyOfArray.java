package GeekForGeeks;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7};

        int[] arr1 = new int[4];
        int[] arr2 = new int[1];

        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.arraycopy(arr, 4, arr2, 0, arr2.length);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
