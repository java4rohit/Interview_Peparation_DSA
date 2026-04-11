package IBM;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(-2);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(-8);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
