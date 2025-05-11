package data_structure_basics.BinarySearchTree;


public class BinarySearchTreeRec {

    Node root;


    public void insert(int value) {
        root = insertNood(root, value);
    }

    public Node insertNood(Node current, int value) {


        if (current == null) {
            return new Node(value);

        }

        if (value <= current.value)
            return insertNood(current.left, value);
        else if (value >= current.value)
            return insertNood(current.right, value);
        else
            return current;

    }

    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        bst.insert(14);
        bst.insert(6);
        bst.insert(4);
        bst.insert(16);
        bst.insert(13);
        bst.insert(19);

        bst.insert(21);
        bst.insert(10);


        System.out.println("In Order traverse: ");
        bst.inOrder(bst.root);

    }
}
