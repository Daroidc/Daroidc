package ConditionalStatementsLab;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());
        double normatom  = 30000;
        double workDays = 365 - restDays;

        double restDaysPlay = restDays * 127;
        double workDaysPlay = workDays * 63;
        double total = restDaysPlay + workDaysPlay;

        if (total > normatom) {
            double drra = (total - normatom) % 60;
            double razl = ((total - normatom) - drra) / 60;
            Math.floor(razl);
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", razl, drra);
        } else {
            double oa = (normatom - total) % 60;
            double os = ((normatom - total) - oa) / 60;
            Math.floor(os);
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", os, oa );

        }
    }
}
