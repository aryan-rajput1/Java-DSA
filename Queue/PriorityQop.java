import java.util.PriorityQueue;

public class PriorityQop {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Enqueue elements
        pq.add(10);
        pq.add(7);
        pq.add(5);
        pq.add(15);

        // Dequeue elements
        int element = pq.poll();
        System.out.println("Dequeued element: " + element);

        // Peek at the highest-priority element
        int highestPriorityElement = pq.peek();
        System.out.println("Highest-priority element: " + highestPriorityElement);

        // Check if the priority queue is empty
        boolean empty = pq.isEmpty();
        System.out.println("Is the priority queue empty? " + empty);

        // Get the size of the priority queue
        int size = pq.size();
        System.out.println("Size of the priority queue: " + size);
    }
}
