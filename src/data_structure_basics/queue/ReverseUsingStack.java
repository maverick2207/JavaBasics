package data_structure_basics.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseUsingStack {

    public static void reverseUsingStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Original Queue: " + queue);

        reverseUsingStack(queue);

        System.out.println("Reversed Queue: " + queue);

    }

}
