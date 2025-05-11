package data_structure_basics.stack;

import java.util.Objects;
import java.util.Stack;

public class StackMaxElement3 {

    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> maxStack = new Stack<>();

    public static void customPush(int item){
        stack.push(item);

        if(maxStack.isEmpty() || item > maxStack.peek())
            maxStack.push(item);

    }

    public static int getMax(){
        return maxStack.peek();
    }

    public static void customPop(Stack<Integer> stack){
        if(stack.isEmpty())
            return;

        if(Objects.equals(stack.peek(), maxStack.peek())) {
            maxStack.pop();
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
        System.out.println("Values available in minStack are: " + maxStack);
        System.out.println("Smallest element in the stack is: " + getMax());
        customPop(stack);

        System.out.println("2nd Smallest element in the stack is: " + getMax());
    }
}
