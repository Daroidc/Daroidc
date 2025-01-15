package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bph = Integer.parseInt(scanner.nextLine());
        int bpm = Integer.parseInt(scanner.nextLine());
        int litri = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double cph = bph * 5.80;
        double cpm = bpm * 7.20;
        double cenaprep = litri * 1.20;
        double czvs = cph + cpm + cenaprep;
        double cenasn = czvs - (czvs * (discount/100));

        System.out.print(cenasn);
    }
}
