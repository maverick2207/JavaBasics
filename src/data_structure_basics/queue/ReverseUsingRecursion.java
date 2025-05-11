package data_structure_basics.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseUsingRecursion {

    public static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty())
            return;

        int item = queue.poll();

        reverseQueue(queue);

        queue.offer(item);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
