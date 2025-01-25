package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double studioprice = 0;
        double apprice = 0;

        if (x.equals("May") || x.equals("October")) {
            studioprice = 50;
            apprice = 65;
        } else if (x.equals("June") || x.equals("September")) {
            studioprice = 75.20;
            apprice = 68.70;
        } else if (x.equals("July") || x.equals("August")) {
            studioprice = 76;
            apprice = 77;
        }

        double totalstudio = b * studioprice;
        double totalap = b * apprice;

        if ((x.equals("May") || x.equals("October")) && b > 7 && b <= 14) {
            totalstudio = totalstudio - totalstudio * 0.05;
        } else if ((x.equals("May") || x.equals("October")) && b > 14) {
            totalstudio = totalstudio - totalstudio * 0.30;
        }
        if ((x.equals("June") || x.equals("September")) && b > 14) {
            totalstudio = totalstudio - totalstudio * 0.20;
        }

        if (b > 14) {
            totalap = totalap - totalap * 0.10;
        }
        System.out.printf("Apartment: %.2f lv.%n", totalap);
        System.out.printf("Studio: %.2f lv.", totalstudio);
    }
}
