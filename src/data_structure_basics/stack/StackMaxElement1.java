package data_structure_basics.stack;

import java.util.Stack;

public class StackMaxElement1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(14);
        stack.push(4);
        stack.push(17);
        stack.push(8);
        stack.push(21);

        System.out.println("Element in stacks are: "+stack);

        System.out.println("Max value in stack is: "+findMaxElement(stack));

    }

    public static int findMaxElement(Stack<Integer> stack){
        int max = Integer.MIN_VALUE;

        for(int element : stack){
            if(element > max){
                max= element;
            }
        }
        return max;
    }
}
