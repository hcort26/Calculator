import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first whole number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second whole number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter '+' for addition or '-' for subtraction: ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println("The sum is: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("The difference is: " + (num1 - num2));
        } else {
            System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}
