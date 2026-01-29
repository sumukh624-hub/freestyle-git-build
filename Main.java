import java.util.Scanner;

public class Main{

    // Method to calculate area of square
    public static double calculateArea(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative.");
        }
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the side length of the square: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }

            double side = scanner.nextDouble();
            double area = calculateArea(side);

            System.out.printf("The area of the square with side %.2f is: %.2f%n", side, area);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
