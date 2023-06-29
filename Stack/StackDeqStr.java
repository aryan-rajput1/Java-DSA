import java.util.Deque;
import java.util.LinkedList;

public class StackDeqStr {
    private Deque<String> deque;

    public StackDeqStr() {
        deque = new LinkedList<>();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void push(String data) {
        deque.push(data);
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.pop();
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.peek();
    }

    public static void main(String[] args) {
        StackDeqStr stack = new StackDeqStr();

        stack.push("Hello");
        stack.push("World");
        stack.push("!");

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element is " + stack.peek());
    }
}
