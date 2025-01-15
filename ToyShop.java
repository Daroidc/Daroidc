package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzel = 2.60;
        double kukla = 3.00;
        double meche = 4.10;
        double min = 8.20;
        double kamion = 2.00;

        double cenanaeks = Double.parseDouble(scanner.nextLine());
        int broipuzeli = Integer.parseInt(scanner.nextLine());
        int broikukli = Integer.parseInt(scanner.nextLine());
        int broimecheta = Integer.parseInt(scanner.nextLine());
        int broimin = Integer.parseInt(scanner.nextLine());
        int broikamion = Integer.parseInt(scanner.nextLine());

        double total = broikamion + broikukli + broipuzeli + broimin + broimecheta;
        double totalcena = (broipuzeli * puzzel) + (broikukli * kukla) + (broimecheta * meche) + (broimin * min) + (broikamion * kamion);

        if (total >= 50) {
            totalcena = totalcena * 0.75;
        }
        double rent = totalcena * 0.10;
        double profit = totalcena - rent;

        if (profit >= cenanaeks) {
            System.out.printf("Yes! %.2f lv left.%n", profit - cenanaeks);
        }
        else
            System.out.printf("Not enough money! %.2f lv needed.%n", cenanaeks - profit);



    }
}
