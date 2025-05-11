package data_structure_basics.BinarySearchTree;

public class BSTDeleteOperation {

    Node root;

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public Node insertNode(Node current, int value) {
        if (current == null)
            return new Node(value);

        if (value < current.value)
            current.left = insertNode(current.left, value);
        else
            current.right = insertNode(current.right, value);

        return current;
    }

    public Node findMinValueNode(Node current) {

        if (current.left != null)
            current = current.left;
        return current;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node current, int value) {

        if (current == null)
            return null;

        if (value < current.value)
            current.left = deleteNode(current.left, value);
        else if (value > current.value)
            current.right = deleteNode(current.right, value);
        else {
            // CASE 1: Node is a leaf node - No children
            if (current.left == null && current.right == null)
                return null;

            // CASE 2: Node has only one child
            if (current.left == null)
                return current.right;
            if (current.right == null)
                return current.left;

            // Case 3: Node has two children
            // Find the inorder successor (smallest node in the right subtree)
            Node successor = findMinValueNode(current.right);

            // Replace the data of the current node with the successor's data

            current.value = successor.value;

            // Delete the inorder successor from the right subtree

            current.right = deleteNode(current.right, successor.value);
        }

        return current;

    }

    public void printInOrder(Node current) {
        if (current != null) {
            printInOrder(current.left);
            System.out.print(current.value + " ");
            printInOrder(current.right);

        }
    }

    public static void main(String[] args) {

        BSTDeleteOperation bdo = new BSTDeleteOperation();
        bdo.insert(18);
        bdo.insert(15);
        bdo.insert(16);
        bdo.insert(10);
        bdo.insert(21);
        bdo.insert(11);
        bdo.insert(26);
        bdo.insert(9);
        bdo.insert(20);
        bdo.insert(4);
        bdo.insert(30);

        System.out.println("In Order traverse BST: ");
        bdo.printInOrder(bdo.root);

        System.out.println("\nDeleting a value from the BST: 10");
        bdo.delete(10);
        bdo.printInOrder(bdo.root);

        System.out.println("\nInserting a new value: 36");
        bdo.insert(36);
        bdo.printInOrder(bdo.root);
        System.out.println("\nDeleting a value from the BST: 21");
        bdo.delete(21);

        bdo.printInOrder(bdo.root);

        System.out.println("\nDeleting a value from the BST: 18");
        bdo.delete(18);

        bdo.printInOrder(bdo.root);

    }
}
