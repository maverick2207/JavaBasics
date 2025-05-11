package data_structure_basics.stack;

public class Stacks {
    private int maxSize;
    private int[] arr;
    private int top;

    public Stacks(int size){
        arr = new int[size];
        maxSize = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }
    // push an element onto the stack
    public void push(int item){
        if(isFull()){
            System.out.println("Stack Overflow! Cannot push "+ item);
            return;
        }
        arr[++top] = item;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! cannot pop");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow! cannot peek");
            return -1;
        }
        return arr[top];
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for(int i = 0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(5);

        System.out.println("is stack empty: "+stack.isEmpty());
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(16);

        System.out.println("is stack full: "+stack.isFull());

        System.out.println("top item in stack right now is: "+stack.peek());

        stack.push(19);

        System.out.println("top item in stack right now is: "+stack.peek());

        stack.push(20);

        System.out.println("is stack full: "+stack.isFull());

        stack.printStack();

        System.out.println("popping top stack item: "+stack.pop());

        stack.printStack();
    }
}
