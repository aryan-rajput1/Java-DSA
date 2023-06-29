public class StackList {
    Node head; 

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public boolean isEmpty() { 
        return head == null; 
    } 

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int popped = head.data;
        head = head.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackList stack = new StackList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element is " + stack.peek());
    }
}
