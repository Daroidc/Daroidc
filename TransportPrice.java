package ConditionalStatementsLab;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String x = scanner.nextLine();


        double taxi = x.equals("day") ? 0.79 : 0.90;
        double taxicena = 0.70 + (n * taxi);
        double buscena = (n >= 20) ? n * 0.09 : Double.MAX_VALUE;
        double vlakcena = (n >= 100) ? n * 0.06 : Double.MAX_VALUE;

        double min = Math.min(taxicena, Math.min(buscena, vlakcena));

        System.out.printf("%.2f%n", min);


        {}
    }
}
