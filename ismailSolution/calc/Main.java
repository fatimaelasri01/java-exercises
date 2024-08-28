package ismailSolution.calc;

import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Calculator!");
            System.out.println("Please choose an operation:");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                running = false;
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calc.sous(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calc.mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calc.div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
            }

            System.out.println(); // Print a blank line for readability
        }

        scanner.close();
    }
}
