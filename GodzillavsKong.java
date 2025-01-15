package ConditionalStatementsLab;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int statisti = Integer.parseInt(scanner.nextLine());
        double obleklocena = Double.parseDouble(scanner.nextLine());
        double dekor = budjet * 0.10;
        double obshtoobl = statisti * obleklocena;

        if (statisti > 150) {
            obshtoobl = obshtoobl * 0.90;

    }         double total = dekor + obshtoobl;


              if (total > budjet) {
                  System.out.println("Not enough money!");
                  System.out.printf("Wingard needs %.2f leva more.%n", total - budjet);
              }
              else {
                  System.out.println("Action!");
                  System.out.printf("Wingard starts filming with %.2f leva left.%n", budjet - total);
              }
    }

}
