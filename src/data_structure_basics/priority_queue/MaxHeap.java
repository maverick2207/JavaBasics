package data_structure_basics.priority_queue;


import java.util.Collections;
import java.util.PriorityQueue;

// descending order
public class MaxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: 50, 30, 20, 10 (descending order)
        }
    }
}
