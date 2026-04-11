package LeetCode.EasyLevel;

import java.util.PriorityQueue;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums = {10, 20, 5, 30, 25, 15};

        int secondLargest = findSecondLargest(nums);
        System.out.println("Second largest number: " + secondLargest);
    }

    public static int findSecondLargest(int[] nums) {
        // Use a PriorityQueue to maintain the largest two elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            // Add number to the queue
            pq.offer(num);

            // Keep only the two largest elements in the queue
            if (pq.size() > 2) {
                pq.poll();
            }
        }

        // Remove the largest element, then peek for the second largest
        //pq.poll(); // Remove the largest element
        return pq.peek(); // The second largest
    }
}
