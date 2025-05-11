package data_structure_basics.stack;

import java.util.Stack;

public class StackMinElement3 {

    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();

    public static void customPush(int item) {
        stack.push(item);

        if (minStack.isEmpty() || item < minStack.peek()) {
            minStack.push(item);
        }

    }

    public static int getMin() {
        return minStack.peek();
    }

    public static void customPop(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
            return;
        }
        stack.pop();
        customPop(stack);

    }

    public static void main(String[] args) {

        customPush(11);
        customPush(13);
        customPush(8);
        customPush(17);
        customPush(15);

        System.out.println("Values available in Stack are: " + stack);
        System.out.println("Values available in minStack are: " + minStack);
        System.out.println("Smallest element in the stack is: " + getMin());
        customPop(stack);

        System.out.println("2nd Smallest element in the stack is: " + getMin());


    }
}
