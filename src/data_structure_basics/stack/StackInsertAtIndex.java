package data_structure_basics.stack;

import java.util.Stack;

public class StackInsertAtIndex {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack value before insertion: " + stack);

        insertAtIndex(stack, 2, 25);

        System.out.println("Stack value after insertion: " + stack);
    }

    public static void insertAtIndex(Stack<Integer> stack, int index, int value) {

        Stack<Integer> temp = new Stack<>();

        if (index < 0 || index > stack.size()) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        for (int i = 0; i < stack.size() - 1; i++) {
            temp.push(stack.pop());
        }

        stack.push(value);

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }
}
