package data_structure_basics.linked_list;

public class AddNodeAtEnd {
   Node head = null;
   Node currentNode = null;
    public void addNode(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            currentNode = head;
        }else {

            currentNode.next = newNode;
//            newNode.next = null;
            currentNode = newNode;
        }

    }

    public void printList(){

        Node current = head;
        while (current!= null){
            System.out.println("Data - "+current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        AddNodeAtEnd a = new AddNodeAtEnd();

        a.addNode(10);
        a.addNode(20);
        a.addNode(30);
        a.addNode(40);
        a.addNode(50);
        a.addNode(60);

        a.printList();



    }
}
