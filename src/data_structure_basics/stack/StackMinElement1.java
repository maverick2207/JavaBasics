package data_structure_basics.stack;

import java.util.Stack;

public class StackMinElement1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(5);
        stack.push(9);

        System.out.println("elements in stack: "+stack);
        System.out.println("Min Element in the stack: "+findMinEleInStack(stack));
        System.out.println("elements in stack: "+stack);

    }

    public static int findMinEleInStack(Stack<Integer> stack){

        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;

        for(Integer ele : stack){
            if(ele <  min){
                min = ele;
            }
        }

        return min;
    }
}
