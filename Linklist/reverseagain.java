import java.util.Stack;

public class reverseagain {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // to add at first
    public void insertatfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // to reverse the list
    // public void reverse() {
    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;
    //     while (current != null) {
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     head = prev;
    // }

    // to reverse using stack
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

    // to print list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverseagain obj = new reverseagain();
        obj.insertatfirst(1);
        obj.insertatfirst(2);
        obj.insertatfirst(3);
        obj.insertatfirst(4);
        obj.insertatfirst(5);
        obj.insertatfirst(6);
        obj.insertatfirst(7);
        obj.insertatfirst(8);
        obj.printList();
        // obj.reverse();
        // obj.printList();
        obj.reverseItstack();
        obj.printList();
    }
}
