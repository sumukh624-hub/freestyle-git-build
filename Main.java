import java.util.Scanner;

public class Main{

    // Method to calculate area of square
    public static double calculateArea(double side) {
        
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            System.out.print("Enter the side length of the square: ");

            double side = 8;
            double area = calculateArea(side);

            System.out.printf("The area of the square with side %.2f is: %.2f%n", side, area);

        }
    }
}
