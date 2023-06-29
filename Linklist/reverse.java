import java.util.*;
public class reverse {
    
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add the elements in the list
    public void insert(int data ){
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }

    // to reverse the linklist using stack
    public void reverseItstack() {
        if (head == null) {
            return;
        }
    
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;
    
        // Push nodes onto the stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
    
        // Pop nodes from the stack to reverse the list
        head = stack.pop();
        temp = head;
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            temp.next = node;
            temp = temp.next;
        }
        temp.next = null;
    }
    
    // reverse a link list using iterative method
    public void reverseIt(){
        if(head==null)
        {
            return;
        }
        else{
            Node prev = null;
            Node current = head;
            Node next = null;
    
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }

    // reverse link list using recurssive method
    public Node reverseRec(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    

    // to print the list 
    public void printList(){
        if(head == null)
        {
            System.out.println("list is empty");
        }
        else{
            Node temp  = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse obj = new reverse();
        System.out.println("Enter the number of elements");
        
        int n = sc.nextInt();
        for(int i = 0; i<n;i++)
        {
            obj.insert(i);
        }
       obj.head = obj.reverseRec(obj.head);
        obj.printList();

        sc.close();
    }
}
