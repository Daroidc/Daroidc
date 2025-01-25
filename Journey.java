package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String x = scanner.nextLine();


        String a = "";
        String b = "";
        double total = 0;
        if (budget <= 100) {
            if (x.equals("summer")) {
                total = budget * 0.30;
                b = "Bulgaria";
                a = "Camp";

            } else if (x.equals("winter")) {
                total = budget * 0.70;
                b = "Bulgaria";
                a = "Hotel";
            }
        } if (budget > 100 && budget <= 1000) {
            if (x.equals("summer")) {
                total = budget * 0.40;
                b = "Balkans";
                a = "Camp";
            } else if (x.equals("winter")) {
                total = budget * 0.80;
                b = "Balkans";
                a = "Hotel";
            }
            } else if (budget > 1000) {
            total = budget * 0.90;
            b = "Europe";
            a = "Hotel";
        } System.out.printf("Somewhere in %s%n", b);
          System.out.printf("%s - %.2f%n", a, total);
    }
}
