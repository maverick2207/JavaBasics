package data_structure_basics.stack;

import java.util.Stack;

public class SortStackASC {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(13);
        stack.push(8);
        stack.push(21);
        stack.push(7);
        stack.push(15);

        System.out.println("Stack Before Sorting in Ascending: "+ stack);
        ascStack(stack);
        System.out.println("Stack after sorting in Ascending: "+stack);

        System.out.println(stack.peek());
    }

    public static void ascStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            int top = stack.pop();
            while(!temp.isEmpty() && temp.peek() > top){
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

    }
}
