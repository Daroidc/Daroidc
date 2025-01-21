package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        boolean nz = x >=100 && x <=200 || x == 0;

        if (nz == false) {
            System.out.println("invalid");
        }

        {}
    }
}
