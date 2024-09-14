package java8.Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *1. Find the even number from  Array list
 *
 *
 *
 */


public class StreamConcept {

    public static void main(String[] args) {

        //1. Find the even number from  Array list

        List<Integer>   list = Arrays.asList(5,10,15,20,35,60,40);

       // 1. Find the even number from  Array list
        List<Integer> evenlist = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());

        System.out.println(evenlist);

        //2. Multiple by each element of list By 2---------------------------------------------------->

        List<Integer> multipleBy2 = list.stream().map(i -> i * 2).collect(Collectors.toList());

        System.out.println(multipleBy2);


        // 3. Select only the pass Student ------------------------------------------------>

        List<Integer> passStudent = list.stream().filter(integer -> integer > 35).toList();

        System.out.println(passStudent);

        // map is used to  convert  the list


        //find the count of faild Student :-------------------------------------------------->


        long count = list.stream().filter(integer -> integer < 35).count();

        System.out.println(count);


        //sort the list ----------------------------------->

        List<Integer> sortList = list.stream().sorted((o1, o2) -> o2-o1).toList();

             //   sorted().collect(Collectors.toList());


        System.out.println(sortList);

        List<String> listString = Arrays.asList("A","AAAA","AA","AAAAAA","A","AAAA","AAA");

        List<String> collect = listString.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());


        System.out.println(collect);

        System.out.println(listString.stream().max((a,b)-> a.length()-b.length()).get());




    }
}
