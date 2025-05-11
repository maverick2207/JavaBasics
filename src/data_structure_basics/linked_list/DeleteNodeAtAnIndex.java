package data_structure_basics.linked_list;

public class DeleteNodeAtAnIndex {
    Node head;

    public void addNode(int val) {
        Node newNode = new Node(val);

        if (head == null)
            head = newNode;
        else {
            Node current = head;
            while (current.next != null)
                current = current.next;

            current.next = newNode;
        }
    }

    public void delAtIndex(int index) {
        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count += 1;
        }
        current.next = current.next.next;

    }

    public void printVal() {
        Node current = head;
        System.out.println("Values available in the linked list: ");
        while (current != null) {
            System.out.printf(current.value + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeAtAnIndex dn = new DeleteNodeAtAnIndex();
        dn.addNode(100);
        dn.addNode(105);
        dn.addNode(110);
        dn.addNode(115);
        dn.addNode(120);
        dn.addNode(125);
        dn.addNode(130);

        System.out.println("Before Deleting the node");
        dn.printVal();

        System.out.println("\nAfter Deleting the node");
        dn.delAtIndex(3);
        dn.printVal();

    }
}
