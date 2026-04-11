package LeetCode.EasyLevel;

import java.util.PriorityQueue;

public class FindTheKthElements {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 4, 2}; // 1,2,3,4,5
        System.out.println(findSecondLargest(nums));
    }

    public static int findSecondLargest(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //MAX HEAP 5,4,3,2,1

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > 2) {
                pq.poll(); // remove the smallest in the top two
            }
        }

        return pq.poll(); // the remaining element is the second largest

    }
}
