package data_structure_basics.queue;

import java.util.Stack;

public class UsingStackEnqueue {

    private Stack<Integer> primaryStack = new Stack<>();
    private Stack<Integer> tempStack = new Stack<>();

    public boolean isEmpty() {
        return primaryStack.isEmpty();
    }

    public void enqueue(int item) {
        while (!primaryStack.isEmpty()) {

            tempStack.push(primaryStack.pop());
        }

        primaryStack.push(item);

        while (!tempStack.isEmpty()) {
            primaryStack.push(tempStack.pop());
        }
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (primaryStack.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = primaryStack.pop();
        return item;
    }

    public int peek() {
        if (primaryStack.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return primaryStack.peek();
    }

    public static void main(String[] args) {
        UsingStackEnqueue q = new UsingStackEnqueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued: " + q.dequeue()); // 1
        q.enqueue(4);
        System.out.println("Dequeued: " + q.dequeue()); // 2
        System.out.println("Peek: "+q.peek());
    }

}
