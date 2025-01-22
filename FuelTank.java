package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

       

        if (x.equals("Diesel") || x.equals("Gasoline") || x.equals("Gas")) {
            if (b >= 25) {
                x = x.toLowerCase();
                System.out.println("You have enough " + x + ".");
            } else  {
                x = x.toLowerCase();
                System.out.println("Fill your tank with " + x + "!");
            }
            } else {
                System.out.println("Invalid fuel!");
            } scanner.close();
        }

        }

