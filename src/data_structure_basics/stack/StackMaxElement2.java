package data_structure_basics.stack;

import java.util.Stack;

public class StackMaxElement2 {

    public static int findMAXEle(Stack<Integer> stack){

        Stack<Integer> temp = new Stack<>();

        int max = stack.peek();

        while(!stack.isEmpty()){
            int top = stack.pop();
            if(top > max){
                max = top;
            }
            temp.push(top);
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return max;
    }
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(14);
        stack.push(4);
        stack.push(17);
        stack.push(8);
        stack.push(21);

        System.out.println("Element in stacks are: "+stack);

        System.out.println("Max value in stack is: "+findMAXEle(stack));

        System.out.println("Element in stacks are: "+stack);

    }
}
