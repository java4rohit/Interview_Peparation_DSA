package LeetCode.EasyLevel;

import java.util.PriorityQueue;

public class FindTheKthElements {
    public static void main(String[] args) {

        int arr[] = {7,8,12,3,4};
        //int K = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

       final int k = pq.size();
        for (int i = 0; i < k; i++) {
            System.out.println(pq.remove());
        }


    }
}
