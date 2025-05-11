package data_structure_basics.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinimumElement {

    Node root;


    public void insertNode(int value) {
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

            else
                current = current.right;

        }

        if (value <= parent.value)
            parent.left = newNode;
        else
            parent.right = newNode;

    }


    public int minElement(Node current){

        Node minNode = null;

        while(current != null){
            minNode = current;
            current = current.left;
        }
        return minNode.value;
    }

    public int maxElement(Node current){
        Node maxNode = null;

        while(current !=null){
            maxNode = current;
            current = current.right;
        }

        return maxNode.value;
    }

    public void inOrder(Node current){
        if(current != null){
            inOrder(current.left);
            System.out.print(current.value+ " ");
            inOrder(current.right);
        }
    }


    public static void main(String[] args) {

        FindMinimumElement fme = new FindMinimumElement();

        fme.insertNode(9);
        fme.insertNode(14);
        fme.insertNode(6);
        fme.insertNode(4);
        fme.insertNode(16);
        fme.insertNode(13);
        fme.insertNode(19);

        System.out.println("In Order traverse BST: ");
        fme.inOrder(fme.root);

        System.out.println("\nMinimum Element in the BST is: "+fme.minElement(fme.root));
        System.out.println("\nMaximum Element in the BST is: "+fme.maxElement(fme.root));

    }
}
