package data_structure_basics.priority_queue;


public class PQUsingLinkedList2 {

    class Node {
        String value;
        int priority;
       Node next;

        Node(String value, int priority) {
            this.value = value;
            this.priority = priority;
            this.next = null;
        }
    }

    public Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(String value, int priority) {
        Node newNode = new Node(value, priority);

        if (head == null || priority < head.priority) {
           newNode.next = head;
           head = newNode;
           return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.priority < priority){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public String dequeue(){
        if(isEmpty()){
            System.out.println("Priority Queue is empty!");
            return null;
        }

        String value = head.value;
        head = head.next;
        return value;
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("Priority Queue is empty!");
            return null;
        }
        return head.value;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Priority Queue is empty!");
            return;
        }
        System.out.println("Values in priority queue - (value, priority): ");
        Node temp = head;
        while (temp != null){
            System.out.println("("+temp.value+", "+temp.priority+") ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        PQUsingLinkedList2 pq = new PQUsingLinkedList2();
        pq.enqueue("Ram cleared the exam", 2);
        pq.enqueue("Ram started preparing for the exam", 0);
        pq.enqueue("Ram took the exam", 1);
        pq.enqueue("Ram joined the company", 3);

        pq.display();

        System.out.println("Top Priority: "+ pq.peek());
        System.out.println("Removing top priority: "+ pq.dequeue());

        pq.display();
    }
}
