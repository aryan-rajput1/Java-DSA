public class assess {
    public class static Node{
        int value;
        Node left;  
        Node right;
    }
   public static Node add(Node root, int value){
        if(root == null){
            root = new Node();
            root.value = value;
            return root;
        }
        if(value < root.value){
            root.left = add(root.left, value);
        }else if(value > root.value){
            root.right = add(root.right, value);
        }else{
            // value already exists
            return root;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        Node l2 = new Node();
        // Node(root,14);
        Node l3 = new Node(root,14);
        l3.next = new node(root,25)
    }
}
