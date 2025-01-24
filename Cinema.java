package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        double redove = Double.parseDouble(scanner.nextLine());
        double koloni = Double.parseDouble(scanner.nextLine());

        double Premiere = 12.00;
        double Normal = 7.50;
        double Discount = 5.00;
        double total = 0;

        if (x.equals("Premiere")) {
            total = redove * koloni * Premiere;
        } else if (x.equals("Normal")) {
            total = redove * koloni * Normal;
        } else if (x.equals("Discount")) {
            total = redove * koloni * Discount;
        }
        System.out.printf("%.2f leva", total);
    }
}
