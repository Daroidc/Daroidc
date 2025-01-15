package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duljina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        int obemnakv = duljina * shirochina * visochina;
        double obemvl = obemnakv * 0.001;
        double zpr = procent/100;
        double nl = obemvl * (1-zpr);

        System.out.print(nl);
    }
}
