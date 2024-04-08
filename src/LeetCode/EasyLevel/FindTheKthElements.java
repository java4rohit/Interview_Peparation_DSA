package LeetCode.EasyLevel;

import java.util.PriorityQueue;

public class FindTheKthElements {
    public static void main(String[] args) {

        int arr[] = {7, 10, 4, 20, 15};//3,4
        int k = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }
}
