package ConditionalStatementsLab;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        if (x % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
