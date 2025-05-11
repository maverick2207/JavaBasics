package data_structure_basics.queue;

/**
 * Deque (Double-Ended Queue)
 * A Deque (pronounced "Deck") is a special type of queue where:
 *
 * Elements can be added or removed from both ends.
 *         Supports FIFO (queue behavior) & LIFO (stack behavior).
 * Efficient O(1) insert/delete at both front and rear.
 *         📌 Java Deque Implementations:
 *
 * ArrayDeque (Most Common, Fastest)
 * LinkedList (Can be used, but slightly slower)
 */



import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(10);
        System.out.println("Peek: "+arrayDeque.peek());
        //push is equivalent to addFirst()
        arrayDeque.addFirst(20);
        System.out.println("Peek First: "+arrayDeque.peek());
        System.out.println("Peek Last: "+arrayDeque.peekLast());
        arrayDeque.addLast(30);

        System.out.println("Peek Last: "+arrayDeque.peekLast());
        arrayDeque.add(40);
        arrayDeque.add(50);
        System.out.println("Peek: "+arrayDeque.peek());
        System.out.println("Removed from Front: " + arrayDeque.pop());

        System.out.println("Removed from Front: " + arrayDeque.pollFirst()); // 5
        System.out.println("Removed from Rear: " + arrayDeque.pollLast()); // 20
    }
}
