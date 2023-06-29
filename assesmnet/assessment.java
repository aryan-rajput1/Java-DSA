import java.util.*;
public class assessment {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    public void BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(Node current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderTraversalRecursive(current.left);
            preOrderTraversalRecursive(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);

        tree.preOrderTraversal(); 
    }
}
