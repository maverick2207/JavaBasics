package data_structure_basics.BinarySearchTree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (value <= current.value)
                current = current.left;

            else current = current.right;

        }

        if (value < parent.value)
            parent.left = newNode;
        else parent.right = newNode;
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

        System.out.println("In Order traverse: ");
        bst.inOrder(bst.root);

    }
}
