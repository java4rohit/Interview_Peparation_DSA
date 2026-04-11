package java8.Stream2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheStringConvertIntoUpperCase {
    public static void main(String[] args) {

        List<String> names = List.of("rohit", "neha", "ankit");

        List<String> collect = names.stream()
                .filter(name -> name.length() > 4)
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());


        List<Integer> integerList = List.of(1,4,2,6,43,21,33,22,66,55,44,8,20);
        List<Integer> collect1 = integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

       // System.out.println(collect1);

        List<String> names1 = List.of("rohit", "neha", "ankit" , "anil" , "gudaiye" , "shyam" , "abhshek");

        List<String> collect2 =  names1.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());

       // System.out.println(collect2);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> collect3 = nums.stream().map(num -> num * num).collect(Collectors.toList());
       // System.out.println(collect3);

        List<Integer> collect4 = integerList.stream().sorted().collect(Collectors.toList());
        //System.out.println(collect4);

        List<Integer> nums1 = List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,4,3,5,6,7,6,8,7,6,2,5,4,8,1,9,1);
        Map<Integer, Integer> collect5 = nums1.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));

        //System.out.println(collect5);
        Map<Integer, Long> frequencyMap = nums1.stream()
                .collect(Collectors.groupingBy(
                        num -> num,                  // key = number itself
                        Collectors.counting()        // count how many times it appears
                ));

        //System.out.println(frequencyMap);


        List<Integer> salartInt = List.of(1,4,2,6,43,21,33,22,66,55,44,8,20,66,4);

        Integer i = salartInt.stream().max((a, b) -> a - b).get();

      //  salartInt.stream().sorted().forEach(k -> System.out.print(k + " "));
        System.out.println();
        Integer skip = salartInt.stream().distinct().sorted((a,b )->b-a).skip(1).findFirst().get();

      //  System.out.println(skip);


       Map<String, Integer> nameSalaryMap = new HashMap<>();

        nameSalaryMap.put("Alice", 100);
        nameSalaryMap.put("Bob", 600);
        nameSalaryMap.put("Charlie", 700);
        nameSalaryMap.put("David", 800);
        nameSalaryMap.put("Eve", 500);
        nameSalaryMap.put("Frank", 900);
     //   nameSalaryMap.put("Alice", 5500);    // duplicate name, value will be updated


        //no dublicate
        Map.Entry<String, Integer> stringIntegerEntry = nameSalaryMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(1);

       // System.out.println(stringIntegerEntry);


        Map<String, Integer> nameSalaryMap2 = new HashMap<>();

        nameSalaryMap2.put("Alice", 100);
        nameSalaryMap2.put("Bob", 600);
        nameSalaryMap2.put("Charlie", 700);
        nameSalaryMap2.put("David", 500);
        nameSalaryMap2.put("Eve", 900);
        nameSalaryMap2.put("Frank", 900);
        nameSalaryMap2.put("Rohit", 900);    // duplicate name, value will be updated


        // duplicate name, value will be updated
        Map<Integer, List<String>>
                collect6 = nameSalaryMap2
                .entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList()
                        )
                ));
        System.out.println(collect6);

        Map.Entry<Integer, List<String>> integerListEntry = nameSalaryMap2
                .entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList()
                        )
                )).entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println(integerListEntry);


    }
}
