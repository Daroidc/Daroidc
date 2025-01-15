package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double obik = x*b;
        System.out.print(obik);

    }
}
