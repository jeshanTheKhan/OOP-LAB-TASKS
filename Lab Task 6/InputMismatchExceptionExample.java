import java.util.*;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true; // Input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        System.out.println("You entered: " + number);
        scanner.close(); // Close the scanner when done
    }
}
