package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        if (operator == '+') {
            int result = x + b;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", x, operator, b, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", x, operator, b, result);
            }

        } else if (operator == '-') {
            int result = x - b;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", x, operator, b, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", x, operator, b, result);
            }

        } else if (operator == '*') {
            int result = x * b;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", x, operator, b, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", x, operator, b, result);
            }

        } else if (operator == '/') {
            if (b <= 0) {
                System.out.printf("Cannot divide %d by zero", x);
            } else {
            double result = 1.0 * x / b;
            System.out.printf("%d / %d = %.2f", x, b, result);
            }

        } else if (operator == '%') {
            if (b <= 0) {
            System.out.printf("Cannot divide %d by zero", x);
        } else {
            int result = x % b;

            System.out.printf("%d %% %d = %d", x, b, result);
        }
        }
    }
}
