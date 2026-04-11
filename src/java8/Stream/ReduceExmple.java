package java8.Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExmple {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        Integer i = nums.stream().reduce(0,(a, b)->a+b);
        //Integer i = nums.stream().reduce(Integer::sum).get();

        System.out.println(i);
    }
}
