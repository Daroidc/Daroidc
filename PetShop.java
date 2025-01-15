package FirstStepsInCodingExercise;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kucheta = 2.50;
        double kotki = 4.00;
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print(a*kucheta+b*kotki + " lv.");
    }
}
