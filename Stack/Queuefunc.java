import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queuefunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int choice;

        do {
            System.out.println("1. Add an item to the queue");
            System.out.println("2. Remove an item from the queue");
            System.out.println("3. View the item at the front of the queue");
            System.out.println("4. View the size of the queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to add to the queue: ");
                    int num = scanner.nextInt();
                    queue.add(num);
                    System.out.println(num + " has been added to the queue.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        int removed = queue.remove();
                        System.out.println(removed + " has been removed from the queue.");
                    } else {
                        System.out.println("The queue is empty.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        int front = queue.peek();
                        System.out.println("The item at the front of the queue is " + front);
                    } else {
                        System.out.println("The queue is empty.");
                    }
                    break;

                case 4:
                    System.out.println("The size of the queue is " + queue.size());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
