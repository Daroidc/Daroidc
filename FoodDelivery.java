package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bpm = Integer.parseInt(scanner.nextLine());
        int bmsr = Integer.parseInt(scanner.nextLine());
        int bvm = Integer.parseInt(scanner.nextLine());

        //Цени за храните
        double pm = 10.35;
        double msr = 12.40;
        double vm = 8.15;

        double czpm = bpm * pm;
        double cmsr = bmsr * msr;
        double czvm = bvm * vm;
        double obshczm = czpm + cmsr + czvm;
        double czd = (obshczm/10)*2;
        double cenazados = 2.50;
        double obshto = obshczm + czd + cenazados;

        System.out.print(obshto);
    }
}
