package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gt = Integer.parseInt(scanner.nextLine());

        double bk = gt - (gt * 0.40);
        double be = bk - (bk * 0.20);
        double bt = be/4;
        double baks = bt/5;

        double razhodi = gt + bk + be + bt +baks;
        System.out.print(razhodi);

    }
}
