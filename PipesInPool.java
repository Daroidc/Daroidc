package ConditionalStatementsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double totalwater = (p1 + p2) * H;


        if (totalwater <= V) {
            double filled = (totalwater / V) * 100;
            double tr1 = (p1 * H / totalwater) * 100;
            double tr2 = (p2 * H / totalwater) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.%n", filled, tr1, tr2);
        } else {
            double over = totalwater - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.%n", H, over);
        }


    }
}
