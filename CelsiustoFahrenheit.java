package FirstStepsInCodingExercise;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradus = Double.parseDouble(scanner.nextLine());

        double faren = gradus * 1.8000 + 32;
        System.out.printf("%,.2f", faren);
    }
}
