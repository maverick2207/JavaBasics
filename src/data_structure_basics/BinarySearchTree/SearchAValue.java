package data_structure_basics.BinarySearchTree;

public class SearchAValue {

    Node root;

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node current, int value) {

        if (current == null)
            return new Node(value);

        if (value < current.value)
            current.left = insertNode(current.left, value);
        else if (value > current.value)
            current.right = insertNode(current.right, value);

        return current;
    }

    public boolean findAValue(Node current, int value) {

        if (current == null)
            return false;


        if (current.value == value)
            return true;
        if (value < current.value)
            return findAValue(current.left, value);
        else if (value > current.value)
            return findAValue(current.right, value);
        else return false;


    }

    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

    public static void main(String[] args) {

        SearchAValue sav = new SearchAValue();


        sav.insert(18);
        sav.insert(15);
        sav.insert(16);
        sav.insert(10);
        sav.insert(21);
        sav.insert(11);
        sav.insert(26);
        sav.insert(9);
        sav.insert(20);
        sav.insert(4);
        sav.insert(30);

        System.out.println("In Order traverse BST: ");
        sav.inOrder(sav.root);

        int valueToSearch = 97;
        System.out.println("\nFinding a value in BST: " + valueToSearch);

        if (sav.findAValue(sav.root, valueToSearch))
            System.out.println("Value - " + valueToSearch + " is available in BST");
        else
            System.out.println("Value - " + valueToSearch + " is not available in BST");


    }
}
