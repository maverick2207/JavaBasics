package data_structure_basics.BinarySearchTree;

public class FindMaxElement {

    Node root;


    public Node insert(int value) {
        root = insertNode(root, value);
        return root;
    }

    public Node insertNode(Node current, int value) {
        if (current == null) {
            current = new Node(value);
            return current;
        }
        if (value < current.value)
            current.left = insertNode(current.left, value);
        else if (value > current.value)
            current.right = insertNode(current.right, value);

        return current;

    }

    //O(log n)
    public int maxElement(Node current){
        Node maxNode = null;
        while(current != null){
            maxNode = current;
            current = current.right;
        }
        return maxNode.value;
    }

    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

    public static void main(String[] args) {

        FindMaxElement fme = new FindMaxElement();

        fme.insert(9);
        fme.insert(14);
        fme.insert(6);
        fme.insert(4);
        fme.insert(16);
        fme.insert(13);
        fme.insert(19);

        System.out.println("In Order traverse BST: ");
        fme.inOrder(fme.root);

        System.out.println("\nMaximum Element in the BST is: "+fme.maxElement(fme.root));
        System.out.println("\nMaximum Element in the BST is: "+fme.maxElement(fme.root));

    }
}
