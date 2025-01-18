import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci sequence up to " + terms + " terms:");
            generateFibonacci(terms);
        }

        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    private static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
