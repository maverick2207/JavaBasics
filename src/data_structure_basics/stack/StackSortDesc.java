package data_structure_basics.stack;

import java.util.Stack;

public class StackSortDesc {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(10);
        stack.push(15);
        stack.push(21);
        stack.push(8);
        stack.push(3);
        stack.push(19);

        System.out.println("Stack Before Sorting in descending order: " + stack);
        sortStackDesc(stack);
        System.out.println("Stack after Sorting in descending order: " + stack);
    }

    public static void sortStackDesc(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int top = stack.pop();
            while (!temp.isEmpty() && temp.peek() < top) {
                stack.push(temp.pop());
            }
            temp.push(top);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }
}
