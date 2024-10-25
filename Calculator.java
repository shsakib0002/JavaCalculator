import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double N1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double N2 = scanner.nextDouble();
        System.out.println("Operators: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("any of:");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1: // Addition
                result = N1 + N2;
                System.out.println("Result: " + result);
                break;
            case 2: // Subtraction
                result = N1 - N2;
                System.out.println("Result: " + result);
                break;
            case 3: // Multiplication
                result = N1 * N2;
                System.out.println("Result: " + result);
                break;
            case 4: // Division
                if (N2 != 0) {
                    result = N1 / N2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.print("Error 404");
                }
                ;
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");

                scanner.close();
        }
    }
}