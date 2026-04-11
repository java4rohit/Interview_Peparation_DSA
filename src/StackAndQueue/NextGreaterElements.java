package StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElements {
    public static void main(String[] args) {
        int [] arr1 = {4,1,2};
        int [] arr2 = {1,3,4,2};
        nextGreaterElement(arr1,arr2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stck = new Stack<>();
        Map<Integer, Integer> mapInt = new HashMap<>();
        int ans[] = new int[nums1.length];

        // monotonic stack -------
        // piche se chodo nums2 ko  fir ek ek krke chodo  phle dekho kiska lund bara hai piche se  phle lund pick kro or dekho stck mie phle se us lund se bada koi lund hai ki nhi agr bada hai toh us value ko uske behave map kr do  nhi toh us value k behave pe -1 kr do

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stck.empty() && stck.peek() < nums2[i]) {
                     stck.pop();
                }

            int res = stck.empty() ? -1 : stck.peek();
            mapInt.put(nums2[i],res);
            stck.push(nums2[i]);

        }
        System.out.println(mapInt);

        return ans;

    }
}
