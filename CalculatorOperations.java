import java.util.Scanner;

public class CalculatorOperations {
     Scanner scanner = new Scanner(System.in);

    /**
     * Adds two numbers provided by user input.
     * @return Sum of the two numbers
     */
    public double add() {
        // Prompt for two numbers
        System.out.print("Enter first number for addition: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number for addition: ");
        double b = Double.parseDouble(scanner.nextLine());

        return a + b;
    }

    
    /**
     * Subtracts second number from first, both provided by user input.
     * @return Difference of the two numbers
     */
    public double subtract() {
        // Prompt for two numbers
        System.out.print("Enter first number for subtraction: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number for subtraction: ");
        double b = Double.parseDouble(scanner.nextLine());

        return a - b;
    }

    /**
     * Multiplies two numbers provided by user input.
     * @return Product of the two numbers
     */
    public double multiply() {
        // Prompt for two numbers
        System.out.print("Enter first number for multiplication: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number for multiplication: ");
        double b = Double.parseDouble(scanner.nextLine());

        return a * b;
    }


    /* 
     * Divides first number by second, both provided by user input.
     * @return Quotient of the two numbers
     * @throws ArithmeticException if the second number is zero
     */
    public double divide() throws ArithmeticException {
        // Prompt for two numbers
        System.out.print("Enter first number for division: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second number for division: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
