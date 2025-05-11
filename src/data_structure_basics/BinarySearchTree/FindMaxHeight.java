package data_structure_basics.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxHeight {

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

    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

    public int findMaxHeight(Node current) {

        if (current == null)
            return 0;

        return 1 + Math.max(findMaxHeight(current.left), findMaxHeight(current.right));

    }

    public int findMaxHeightItr() {

        int height = 0;
        if (root == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            height++;
        }


        return height;
    }

    public static void main(String[] args) {
        FindMaxHeight fmh = new FindMaxHeight();


        fmh.insert(18);
        fmh.insert(15);
        fmh.insert(16);
        fmh.insert(10);
        fmh.insert(21);
        fmh.insert(11);
        fmh.insert(26);
        fmh.insert(9);
        fmh.insert(20);
        fmh.insert(4);
        fmh.insert(30);

        System.out.println("In Order traverse BST: ");
        fmh.inOrder(fmh.root);

        System.out.println("\nMax Height using recursion: " + fmh.findMaxHeight(fmh.root));

        System.out.println("\nMax Height using iteration: " + fmh.findMaxHeightItr());

    }


}
