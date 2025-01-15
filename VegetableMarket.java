package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double zelen = Double.parseDouble(scanner.nextLine());
        double plodove = Double.parseDouble(scanner.nextLine());
        int obshtozel = Integer.parseInt(scanner.nextLine());
        int obshtoplod = Integer.parseInt(scanner.nextLine());

        double obshcz = zelen * obshtozel;
        double obshpld = plodove * obshtoplod;
        double vs = obshcz + obshpld;

        double vev = vs / 1.94;

        System.out.printf("%,.2f", vev);
    }
}
