package data_structure_basics.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQUsingComparatorReverse {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        queue.add(5);
        queue.add(15);
        queue.add(10);
        queue.add(7);
        queue.add(5);
        queue.add(6);

        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}
