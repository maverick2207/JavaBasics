package data_structure_basics.queue;

class Node{
    Node next;
    int value;

    public Node(int value){
        this.next = null;
        this.value = value;
    }
}
public class QueueUsingLinkedList {

    Node front = null;
    Node rear = null;

    public boolean isEmpty(){
       return front == null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued - "+ value);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = front.value;
        front = front.next;
        if(front == null) rear = null;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.value;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
    }



}
