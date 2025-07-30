import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        printNumber(sc); // Call method and pass Scanner

        sc.close(); // Close Scanner
    }

    public static void printNumber(Scanner sc) {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // Read integer input
        System.out.println("You entered: " + number); // Print the number
    }
}
