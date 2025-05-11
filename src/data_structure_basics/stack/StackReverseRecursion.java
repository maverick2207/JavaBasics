package data_structure_basics.stack;

import java.util.Stack;

public class StackReverseRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reverese Stack: " + stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {

        if (stack.isEmpty()) {
            stack.push(item);
        } else {

            int top = stack.pop();

            insertAtBottom(stack, item);

            stack.push(top);
        }
    }
}
