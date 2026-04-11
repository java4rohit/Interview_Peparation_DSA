package StackAndQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {


        Queue<Integer> integerQueue = new PriorityQueue<>(Collections.reverseOrder());


        integerQueue.add(1);
        integerQueue.add(5);
        integerQueue.add(2);
        integerQueue.add(15);
        integerQueue.add(12);
        integerQueue.add(17);
        integerQueue.add(9);
        integerQueue.add(3);
        integerQueue.add(8);

        //integerQueue.offer();


        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());



    }
}
