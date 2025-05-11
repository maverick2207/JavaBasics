package data_structure_basics.linked_list;

public class LLInsertAtAnIndex {
    Node head;
    public void addingNode(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next=newNode;
        }
    }

    public void addNodeAtIndex(int index, int val){
        Node newNode = new Node(val);
        int count = 0;
        Node current = head;

        if(index == 0){
            head = newNode;
            head.next = current;
            return;
        }

        while (current != null && count < index-1){
            current = current.next;
            count+=1;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printVal(){
        Node current = head;
        System.out.println("Values in Linked List are: ");
        while(current != null){
            System.out.print(current.value+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LLInsertAtAnIndex ll = new LLInsertAtAnIndex();
        ll.addingNode(10);
        ll.addingNode(20);
        ll.addingNode(30);
        ll.addingNode(40);
        ll.addingNode(50);
        ll.addingNode(60);

        System.out.println("\nvalues before inserting new node: ");
        ll.printVal();

        ll.addNodeAtIndex(0, 70);
        System.out.println("\nvalues After inserting new node: ");

        ll.printVal();
    }
}
