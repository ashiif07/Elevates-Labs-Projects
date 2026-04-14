import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Java Console Calculator -----");

        while (true) {

            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Exit");

            System.out.println("Enter your Choice:\t");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator... Goodbye!");
                scanner.close();
                return;
            }
            double num1, num2;

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter First Number:\t");
                num1 = scanner.nextDouble();
                System.out.println("Enter Second Number:\t");
                num2 = scanner.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + sub(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + mul(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + div(num1, num2));
                        break;
                }
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double sub(double num1, double num2) {
        return num1 - num2;
    }

    private static double mul(double num1, double num2) {
        return num1 * num2;
    }

    private static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
