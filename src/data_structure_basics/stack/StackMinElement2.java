package data_structure_basics.stack;

import java.util.Stack;

public class StackMinElement2 {

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

    private static int findMinEleInStack(Stack<Integer> stack) {
        Stack <Integer> temp = new Stack<>();
        
        int min = stack.peek();
        
        while(!stack.isEmpty()){

            int top = stack.pop();
            if (top < min){
                min = top;
            }
           temp.push(top);
        }

        // retrieving original stack
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return min;

    }
}
