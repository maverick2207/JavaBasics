package data_structure_basics.priority_queue;

import java.util.PriorityQueue;

public class MinHeapDefault {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Priority Queue is Empty: "+pq.isEmpty());

        pq.add(6);
        pq.add(3);
        System.out.println("Priority Queue is Empty: "+pq.isEmpty());

        pq.add(9);
        System.out.println("Top element currently in priority queue: "+pq.peek());

        pq.add(2);

        System.out.println("Poping top element in the priority queue: "+pq.poll());

        pq.add(5);

        System.out.println("item available in priority queue: ");
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}
