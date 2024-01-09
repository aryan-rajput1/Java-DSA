import java.util.Scanner;
import java.util.Arrays;

public class PrimeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an array of numbers from the input
        int n = scanner.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        // Calculate the LCM of the numbers in the array
        long lcm = calculateLCM(numbers);

        // Add the smallest number to the LCM
        long smallestNumber = Arrays.stream(numbers).min().getAsLong();
        long result = lcm + smallestNumber;

        // Check if the result is a prime number
        if (isPrime(result)) {
            System.out.println(result);
        } else {
            System.out.println("Nothing");
        }
        scanner.close();
    }

    // Function to calculate the LCM of an array of numbers
    public static long calculateLCM(long[] numbers) {
        long lcm = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / gcd(lcm, numbers[i]);
        }

        return lcm;
    }

    // Function to calculate the greatest common divisor (GCD)
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to check if a number is prime
    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
