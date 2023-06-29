import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove the element with the highest priority
        int highestPriorityElement = queue.poll();

        // Print the highest priority element
        System.out.println("Highest priority element: " + highestPriorityElement);

        // Print the queue again
        System.out.println("Queue after removing highest priority element: " + queue);
    }
}
