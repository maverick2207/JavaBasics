package data_structure_basics.stack;

import java.util.Stack;

public class StackReverse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println("Values in stack before reversing: "+stack);

        System.out.println("Values in stack after reversing: "+stackReverse(stack));
    }

    public static Stack<Integer> stackReverse(Stack<Integer> stack){

        Stack <Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }

        return temp;
    }
}
