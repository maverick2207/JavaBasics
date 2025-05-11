package data_structure_basics.stack;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

}

public class LinkedListStack {

    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    public Integer peek() {

        return top.value;

    }

    public Integer pop() {

        int topValue = top.value;
        top = top.next;
        return topValue;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack() {

        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedListStack lls = new LinkedListStack();

        System.out.println("Is Stack Empty: "+ lls.isEmpty());

        System.out.println("Values in stack: ");
        lls.printStack();

        lls.push(10);
        lls.push(20);
        lls.push(8);

        System.out.println("Top Value: " + lls.peek());

        lls.push(13);

        System.out.println("Values in stack: ");
        lls.printStack();

        System.out.println("Poped Value: "+lls.pop());

        System.out.println("Values in stack: ");
        lls.printStack();

    }
}
