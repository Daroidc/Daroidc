package ConditionalStatementsLab;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int broirabotnici = Integer.parseInt(scanner.nextLine());

        double obshtogrozde = x * y;
        int ploshtzavino = (int) ((obshtogrozde * 0.40) / 2.50);
        int vinozaproizvodstvo = (int) Math.floor(ploshtzavino);

        if (vinozaproizvodstvo >= z) {
            int ostatuk = vinozaproizvodstvo - z;
            int zachovek = ostatuk / broirabotnici;
            System.out.println("Good harvest this year! Total wine: " + vinozaproizvodstvo + " liters.");
            System.out.println(ostatuk + " liters left -> " + zachovek + " liters per person.");
        } else {
            int dr = z - vinozaproizvodstvo;
            System.out.println("It will be a tough winter! More " + dr + " liters wine needed.");

        }

    }
}
