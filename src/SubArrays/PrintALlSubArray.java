package SubArrays;

import java.util.ArrayList;
import java.util.List;

public class PrintALlSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 8,5, 2, 6, -6, 3, 2};
        int k = 5;
        //printAllSubarrays(arr);
        printTheSubArraySumK(arr, k);
    }

    private static void printAllSubarrays(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    private static void printTheSubArraySumK(int[] arr, int k) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            List<Integer> list1 = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                list1.add(arr[j]);
                if (sum == k) {
                    list.add(new ArrayList<>(list1));
                }

            }
            //System.out.println(list1);
        }

        System.out.println(list);

    }
}
