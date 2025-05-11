package data_structure_basics.linked_list;

public class LinkedListAddStart {
    Node head;

    public void addStart(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void printValInList() {
        Node currentNode = head;
        System.out.println("Values Available in Linked List are: ");
        while (currentNode != null) {
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddStart ll = new LinkedListAddStart();

        ll.addStart(10);
        ll.addStart(20);
        ll.addStart(30);
        ll.addStart(40);
        ll.addStart(50);
        ll.addStart(60);
        ll.addStart(70);

        ll.printValInList();

    }
}
