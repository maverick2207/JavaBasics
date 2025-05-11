package data_structure_basics.queue;

import java.util.Stack;

public class UsingStackDeque {

    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2  = new Stack<>();

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){

        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }


    public static void main(String[] args) {

        UsingStackDeque q = new UsingStackDeque();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued: " + q.dequeue()); // 1
        q.enqueue(4);
        System.out.println("Dequeued: " + q.dequeue()); // 2
        System.out.println("Queue: "+q.peek());

    }
}
