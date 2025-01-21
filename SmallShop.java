package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        double x = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (b.equals("Sofia")) {
            if (a.equals("coffee")) {
              price = 0.50;
            } else if (a.equals("water")) {
                 price = 0.80;
            } else if (a.equals("beer")) {
                 price = 1.20;
            } else if (a.equals("sweets")) {
                 price = 1.45;
            } else if (a.equals("peanuts")) {
                 price = 1.60;
            }
        } else if (b.equals("Plovdiv")) {
            if (a.equals("coffee")) {
                price = 0.40;
            } else if (a.equals("water")) {
                price = 0.70;
            } else if (a.equals("beer")) {
                price = 1.15;
            } else if (a.equals("sweets")) {
                price = 1.30;
            } else if (a.equals("peanuts")) {
                price = 1.50;
            }
        } else if (b.equals("Varna")) {
            if (a.equals("coffee")) {
                price = 0.45;
            } else if (a.equals("water")) {
                price = 0.70;
            } else if (a.equals("beer")) {
                price = 1.10;
            } else if (a.equals("sweets")) {
                price = 1.35;
            } else if (a.equals("peanuts")) {
                price = 1.55;
            }
        }
        double total = x * price;
        System.out.println(total);
    }

}
