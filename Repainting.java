package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nkn = Integer.parseInt(scanner.nextLine());
        int nkb = Integer.parseInt(scanner.nextLine());
        int krz = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double perc = nkb/10;
        double szn = (nkn + 2) * 1.50;
        double szb = (nkb + perc) * 14.50;
        double szr = krz * 5.00;
        double sztr = 0.40;
        double obshszm = szn + szb + szr + sztr;
        double szm = (obshszm * 0.30) * hours;
        double ks = obshszm + szm;

        System.out.print(ks);

    }
}
