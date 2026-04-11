package SubArrays;

import java.util.HashMap;
import java.util.Map;

public class subarraySum {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int k = 5;

        int toatalNosubarraySum = findToatalNosubarraySum(a, k);
        System.out.println(toatalNosubarraySum);
    }

    private static int findToatalNosubarraySum(int[] a, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int num : a) {
            sum = sum + num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
