package ConditionalStatementsLab;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int ostavenahrana = Integer.parseInt(scanner.nextLine());
        double dogfood = Double.parseDouble(scanner.nextLine());
        double catfood = Double.parseDouble(scanner.nextLine());
        double turtlefoodgm = Double.parseDouble(scanner.nextLine());
        double turtlefoodkg = turtlefoodgm / 1000;

        double dogneeds = days * dogfood;
        double catneeds = days * catfood;
        double turtleneeds = days * turtlefoodkg;
        double total = dogneeds + catneeds + turtleneeds;

        if (ostavenahrana > total) {
            int dali = (int) (ostavenahrana - total);
            Math.floor(dali);
            System.out.printf("%d kilos of food left.%n", dali);
        } else {
            int ddali = (int) Math.ceil(total - ostavenahrana);
            System.out.printf("%d more kilos of food are needed.%n", ddali);
        }
    }
}
