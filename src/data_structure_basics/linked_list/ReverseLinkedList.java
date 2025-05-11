package data_structure_basics.linked_list;

public class ReverseLinkedList {
    Node head;
    public void addNode(int value){
        Node newNode = new Node(value);

        if(head == null){
            head=newNode;
        }else {
            Node current = head;
            while(current.next != null){

                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printVal(){

        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public void reverseLL(){
        Node current = head;
        Node next = null;
        Node previous = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        head = previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.addNode(50);
        ll.addNode(60);
        ll.addNode(70);

        System.out.println("Linked List before reversing");
        ll.printVal();

        ll.reverseLL();
        System.out.println("\nLinked List after reversing");

        ll.printVal();
    }
}
