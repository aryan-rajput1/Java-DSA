import java.util.Deque;
import java.util.LinkedList;

public class StackDeqInt {
    private Deque<Integer> deque;

    public StackDeqInt() {
        deque = new LinkedList<>();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void push(int data) {
        deque.push(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.peek();
    }

    public static void main(String[] args) {
        StackDeqInt stack = new StackDeqInt();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element is " + stack.peek());
    }
}
