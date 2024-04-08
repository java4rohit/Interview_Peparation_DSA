package java8.QuestionDSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheMissingElemet {
    public static void main(String[] args) {

        int arr [] = {7,2,3,4,6,1};

        // find the max element from the arr

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();


        int missingNumber  = IntStream.rangeClosed(min,max)
                .filter(num -> Arrays.stream(arr).noneMatch(n -> n ==num)).findFirst().getAsInt();

        System.out.println(missingNumber);
    }
}
