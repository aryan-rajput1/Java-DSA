import java.util.Scanner;

 class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
    this.value = value;
    left = null;
    right = null;
  }
}

public class preorder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of nodes in the tree: ");
    int n = scanner.nextInt();
    Node root = null;
    System.out.println("Enter the " + n + " nodes:");
    for (int i = 0; i < n; i++) {
      int value = scanner.nextInt();
      root = insert(root, value);
    }
    System.out.println("Pre-order traversal of the tree:");
    preorderTraversal(root);
  }

  public static Node insert(Node root, int value) {
    if (root == null) {
      return new Node(value);
    } else if (value <= root.value) {
      root.left = insert(root.left, value);
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }

  public static void preorderTraversal(Node root) {
    if (root != null) {
      System.out.print(root.value+"--");
      preorderTraversal(root.left);
      preorderTraversal(root.right);
    }
  }
}
