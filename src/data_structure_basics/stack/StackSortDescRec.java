package data_structure_basics.stack;

import java.util.Stack;

public class StackSortDescRec {

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
        sortDescRec(stack);
        System.out.println("Stack after Sorting in descending order: " + stack);

    }

    public static void sortDescRec(Stack<Integer> stack){
        if(stack.isEmpty())
            return;

        int top = stack.pop();

        sortDescRec(stack);

        insertAtCorrectOrder(stack,top);
    }

    private static void insertAtCorrectOrder(Stack<Integer> stack, int item) {

        if(stack.isEmpty() || stack.peek() < item){
            stack.push(item);
            return;
        }

        int top = stack.pop();

        insertAtCorrectOrder(stack,item);
        stack.push(top);

    }
}
