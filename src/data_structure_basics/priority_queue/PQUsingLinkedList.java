package data_structure_basics.priority_queue;


class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class PQUsingLinkedList {

    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void enqueue(int value) {
        Node newNode = new Node(value);
        if (head == null || value < head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.value < value)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;

    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty!");
            return -1;
        }
        int top = head.value;
        head = head.next;
        return top;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Priority queue is empty!");
            return -1;
        }
        return head.value;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty!");
            return;
        }
        Node temp = head;
        System.out.println("Sorted value available in priority queue: ");
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        PQUsingLinkedList pq = new PQUsingLinkedList();

        pq.enqueue(9);
        pq.enqueue(6);
        pq.enqueue(7);
        pq.enqueue(10);
        pq.display();
        System.out.println("Top Element in the queue: "+ pq.peek());
        System.out.println("Dequeue Top Element in the queue: "+ pq.dequeue());
        pq.enqueue(3);
        pq.enqueue(8);
        pq.display();
        System.out.println("Dequeue Top Element in the queue: "+ pq.dequeue());
        System.out.println("Top Element in the queue: "+ pq.peek());
        pq.display();

    }
}
