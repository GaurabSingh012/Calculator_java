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
            try {
                // Get user choice
                System.out.print("Enter your choice (1-8): ");
                int choice = Integer.parseInt(scanner.nextLine());

                // Handle operation based on choice
                switch (choice) {
                    case 1:
                        performBinaryOperation(scanner, calc, "Addition", "add");
                        break;
                    case 2:
                        performBinaryOperation(scanner, calc, "Subtraction", "subtract");
                        break;
                    case 3:
                        performBinaryOperation(scanner, calc, "Multiplication", "multiply");
                        break;
                    case 4:
                        performBinaryOperation(scanner, calc, "Division", "divide");
                        break;
                    case 5:
                        performUnaryOperation(scanner, calc, "Square", "square");
                        break;
                    case 6:
                        performUnaryOperation(scanner, calc, "Cube", "cube");
                        break;
                    case 7:
                        performUnaryOperation(scanner, calc, "Square Root", "squareRoot");
                        break;
                    case 8:
                        continueCalc = false;
                        System.out.println("Calculator exiting. Goodbye!");
                        break;
                    default:
                        throw new InvalidInputException("Choice must be between 1 and 8.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
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
