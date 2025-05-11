package data_structure_basics.linked_list;

public class LinkedListAddEnd {
    Node head;

    public void addEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {

                currentNode = currentNode.next;
            }
            currentNode.next = newNode;

        }
    }

    public void printLinkedList() {
        Node currentNode = head;
        System.out.println("Values Available in Linked List are: ");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddEnd ll = new LinkedListAddEnd();

        ll.addEnd(10);
        ll.addEnd(20);
        ll.addEnd(30);
        ll.addEnd(40);
        ll.addEnd(50);
        ll.addEnd(60);

        ll.printLinkedList();
    }
}
