package data_structure_basics.linked_list;

public class deleteNodeWithEvenVal {

    Node head;
    public void addNode(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current  = current.next;
            }
            current.next = newNode;
        }
    }

    public void delEvenNumberNode(){

        while(head != null && head.value%2 == 0){
            head = head.next;
        }
        Node current = head;
        while(current != null && current.next != null){

            if(current.next.value%2 == 0){
                current.next = current.next.next;
            }else
                current = current.next;
        }
    }

    public void printVal(){

        Node current = head;

        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        deleteNodeWithEvenVal de = new deleteNodeWithEvenVal();

        de.addNode(2);
        de.addNode(6);
        de.addNode(9);
        de.addNode(11);
        de.addNode(15);
        de.addNode(16);
        de.addNode(19);
        de.addNode(20);

        System.out.println("Values available before deleting even values: ");
        de.printVal();

        System.out.println("\nValues available after deleting even values: ");
        de.delEvenNumberNode();

        de.printVal();
    }
}
