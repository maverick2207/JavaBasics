package data_structure_basics.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Traversal	Step Order	Use Case	Example Output
 * In-order	Left → Root → Right	Sorted order for BST	4 2 5 1 3
 * Pre-order	Root → Left → Right	Create/copy tree, prefix notation	1 2 4 5 3
 * Post-order	Left → Right → Root	Delete tree, postfix evaluation	4 5 2 3 1
 */
public class BinaryTreeImplementation {

    Node root;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                return;
            } else queue.offer(current.left);

            if (current.right == null) {
                current.right = newNode;
                return;
            } else queue.offer(current.right);
        }

    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

    }

    public void postOrder(Node node) {
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

    }


    public static void main(String[] args) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();

        bt.insert(10);
        bt.insert(7);
        bt.insert(12);
        bt.insert(9);
        bt.insert(15);

        System.out.println("In-order traversal:");

        bt.inOrder(bt.root);
        System.out.println("\npre-order traversal:");
        bt.preOrder(bt.root);
        System.out.println("\npost-order traversal:");
        bt.postOrder(bt.root);

    }
}
