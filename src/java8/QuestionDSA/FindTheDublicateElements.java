package java8.QuestionDSA;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FindTheDublicateElements {
    public static void main(String[] args) {

      int arr[] = {1,3,4,2,2};


        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }


        hashMap.forEach((k,v)->{
            if(v>1){
                System.out.println(k);
            }
        });



//
//        // Print the found duplicate elements
//        List<Integer> duplicates = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(i -> i))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue().size() > 1)
//                .map(e -> e.getKey())
//                .collect(Collectors.toList());
//
//        int duplicate = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(i -> i))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue().size() > 1)
//                .map(Map.Entry::getKey)
//                .findFirst().get();// Default value if no duplicates are found
//
//        System.out.println("Duplicate element: " + duplicate);
//
//
//        System.out.println("Duplicate elements: " + duplicates.get(0));
//




    }
}
