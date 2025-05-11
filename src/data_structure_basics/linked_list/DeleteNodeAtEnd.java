package data_structure_basics.linked_list;

public class DeleteNodeAtEnd {

    Node head;
    public void addNode(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delNodeAtEnd(){
        Node current = head;

        while(current.next != null){

            current = current.next;

            if(current.next.next==null){
                current.next = null;
                return;
            }
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
        DeleteNodeAtEnd dl = new DeleteNodeAtEnd();
        dl.addNode(10);
        dl.addNode(20);
        dl.addNode(30);
        dl.addNode(40);
        dl.addNode(50);
        dl.addNode(60);
        dl.addNode(70);
        dl.addNode(80);

        System.out.println("Values Before Deleting the node: ");
        dl.printVal();

        System.out.println("\nValues after deleting from the node: ");
        dl.delNodeAtEnd();
        dl.printVal();

    }
}
