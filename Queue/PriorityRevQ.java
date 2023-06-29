import java.util.PriorityQueue;

public class PriorityRevQ {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator that reverses the ordering of the elements
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove the element with the lowest priority
        int lowestPriorityElement = queue.poll();

        // Print the lowest priority element
        System.out.println("Lowest priority element: " + lowestPriorityElement);

        // Print the queue again
        System.out.println("Queue after removing lowest priority element: " + queue);
    }
}
