package com.Rajvardhan;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//class changeOrder implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        int cmp = -Integer.compare(o1, o2);
//        return cmp;
//    }
//}

public class PriorityQueueCode {
    Queue<Integer> pq = new PriorityQueue<>();

    void addElement() {
        pq.offer(15);
        pq.offer(23);
        pq.offer(364);
        pq.offer(54);
        pq.offer(78);
        pq.offer(91);
    }

    void printElement() {
//        System.out.println(pq);
         while (!pq.isEmpty()) {
         System.out.println(pq.poll());
         }

    }
}