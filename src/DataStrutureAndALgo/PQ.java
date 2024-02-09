package DataStrutureAndALgo;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PQ {

    public static void main(String[] args) {

        int [] arr = {2,5,6,1,8,9};


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }

            }

            System.out.println(Arrays.toString(arr));

        }
    }
}
