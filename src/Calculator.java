import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter '+', '-', '*', or '/' for the operation: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The quotient is: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}
