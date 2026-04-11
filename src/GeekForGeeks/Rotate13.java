package GeekForGeeks;

import java.util.Arrays;

public class Rotate13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
    }

    public static void rotate(int[] arr) {

        // code here
        int n = arr.length;
        int leftArrSize = n - 3; // if you change the value of 1 with n which  its swap that much index
        int rightArrSize = n - leftArrSize;

        int[] arr1 = new int[leftArrSize];
        int[] arr2 = new int[rightArrSize];

        System.arraycopy(arr, 0, arr1, 0, arr1.length);

        int j = 0;
        for (int i = arr1.length; i < arr.length; i++) {
            if (j < arr.length) {
                arr2[j] = arr[i];
                j++;
            }
        }
        //Swap First Arr----------------------------------

        int i = 0;
        int x = arr1.length - 1;
        while (i < x) {
            int temp = arr1[i];
            arr1[i] = arr1[x];
            arr1[x] = temp;
            i++;
            x--;
        }

        int m = 0;
        int l = arr2.length - 1;
        while (m < l) {
            int temp = arr2[m];
            arr2[m] = arr2[l];
            arr2[l] = temp;
            m++;
            l--;
        }

        //Merge--------------------------->>
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

          //prints the resultant array

        int min = 0;
        int max = arr.length-1;
        while (min < max) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
