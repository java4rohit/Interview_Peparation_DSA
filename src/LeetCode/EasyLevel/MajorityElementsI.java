package LeetCode.EasyLevel;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class MajorityElementsI {
    public static void main(String[] args) {

        int nums[] = {2, 2, 1, 1, 1, 2, 2,2,2,2,2,3,4};

        majorityElement(nums);
    }

    private static void majorityElement(int[] nums) {

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int n : nums) {
            integerMap.put(n, integerMap.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(integerMap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        int n = entryList.get(0).getKey();
    }



}
