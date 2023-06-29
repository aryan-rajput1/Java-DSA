import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRecursive(root, data);
    }

    Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRecursive(root.left, data);
        else if (data > root.data)
            root.right = insertRecursive(root.right, data);

        return root;
    }

    int diameter() {
        return diameterRecursive(root);
    }

    int diameterRecursive(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameterRecursive(root.left);
        int rightDiameter = diameterRecursive(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}

public class diameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BinaryTree tree = new BinaryTree();

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            tree.insert(data);
        }

        int diameter = tree.diameter();

        System.out.println("Diameter of the tree is: " + diameter);
    }
}
