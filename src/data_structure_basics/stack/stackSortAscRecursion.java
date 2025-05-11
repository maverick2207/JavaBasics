package data_structure_basics.stack;

import java.util.Stack;

public class stackSortAscRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(21);
        stack.push(13);
        stack.push(31);
        stack.push(9);
        stack.push(12);
        stack.push(19);

        System.out.println("Stack before sorting: "+stack);
        ascSorRec(stack);
        System.out.println("Stack After Sorting: "+stack);

    }

    public static void ascSorRec(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();

        ascSorRec(stack);

        insertAtCorrectPos(stack, top);
    }

    private static void insertAtCorrectPos(Stack<Integer> stack, int top) {
        if (stack.isEmpty() || stack.peek() > top) {
            stack.push(top);
            return;
        }
        int temp = stack.pop();
        insertAtCorrectPos(stack, top);
        stack.push(temp);
    }

}
