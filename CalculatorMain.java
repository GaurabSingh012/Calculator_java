/*
 * Name: Gaurab Kumar Kushwaha
 * PRN: 23070126045
 * Batch: SY AIML A2
 */
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOperations calc = new CalculatorOperations();
        boolean continueCalc = true;

        while (continueCalc) {
            // Display menu
            displayMenu();
            
        }
        scanner.close();
    }

    // Display operation menu
    private static void displayMenu() {
        System.out.println("\n=== Calculator Menu ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("8. Exit");
    }

    // Handle binary operations (e.g., addition, subtraction)
    private static void performBinaryOperation(Scanner scanner, CalculatorOperations calc, String operation, String method)
            throws InvalidInputException {
        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        try {
            double result = switch (method) {
                case "add" -> calc.add(num1, num2);
                case "subtract" -> calc.subtract(num1, num2);
                case "multiply" -> calc.multiply(num1, num2);
                case "divide" -> calc.divide(num1, num2);
                default -> throw new InvalidInputException("Invalid operation.");
            };
            System.out.printf("%s Result: %.2f%n", operation, result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Handle unary operations (e.g., square, cube, square root)
    private static void performUnaryOperation(Scanner scanner, CalculatorOperations calc, String operation, String method)
            throws InvalidInputException {
        System.out.print("Enter a number: ");
        double num = Double.parseDouble(scanner.nextLine());

        try {
            double result = switch (method) {
                case "square" -> calc.square(num);
                case "cube" -> calc.cube(num);
                case "squareRoot" -> calc.squareRoot(num);
                default -> throw new InvalidInputException("Invalid operation.");
            };
            System.out.printf("%s Result: %.2f%n", operation, result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
