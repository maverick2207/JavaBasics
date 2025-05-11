package data_structure_basics.linked_list;

public class DeleteNodeAtStart {
    Node head;
    public void addNode(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delAtStart(){
        Node current  = head;

        head = current.next;
    }
    public void printVal(){
        Node current = head;

        System.out.println("Values Available in Linked List are: ");

        while(current != null){

            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DeleteNodeAtStart de = new DeleteNodeAtStart();

        de.addNode(10);
        de.addNode(20);
        de.addNode(30);
        de.addNode(40);
        de.addNode(50);
        de.addNode(60);

        System.out.println("Value before deleting : ");

        de.printVal();

        System.out.println("\nValue after deleting : ");
        de.delAtStart();
        de.printVal();

    }
}
