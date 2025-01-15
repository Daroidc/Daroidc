package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriq = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double palamud = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        int midi = Integer.parseInt(scanner.nextLine());

        double palamudcena = skumriq * 1.60;
        double safridcena = caca * 1.80;

        double sumapal = palamud * palamudcena;
        double sumasafrid = safrid * safridcena;
        double sumamidi = midi * 7.50;

        double obshvs = sumapal + sumamidi + sumasafrid;
        System.out.printf("%,.2f", obshvs);
    }
}
