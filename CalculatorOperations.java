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


}
