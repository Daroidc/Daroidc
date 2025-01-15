package FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiana = Double.parseDouble(scanner.nextLine());
        double p = 3.14159;
        double gradus = radiana * 180 / Math.PI;
        System.out.print(gradus);
    }
}
