package data_structure_basics.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MaxHeapComparator implements Comparator<String> {

    public int compare(String s1, String s2) {

        return s2.compareTo(s1);
    }

}

public class PQUsingSpecificComparator {


    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new MaxHeapComparator());
        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("89");
        queue.add("K");
        queue.add("S");
        queue.add("4");

        System.out.println("The elements with the highest priority element at front of queue"
                + "order:");

        while(!queue.isEmpty())
            System.out.print(queue.poll()+" ");
    }
}
