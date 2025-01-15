package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dz = Double.parseDouble(scanner.nextLine());
        int sd = Integer.parseInt(scanner.nextLine());
        double glp = Double.parseDouble(scanner.nextLine());

        double lihva = dz*glp/100*sd/12;
        double ks = dz + lihva;

        System.out.print(ks);

    }
}
