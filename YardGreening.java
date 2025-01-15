package FirstStepsInCodingExercise;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kvmetri = Double.parseDouble(scanner.nextLine());
        double edna = kvmetri * 7.61;
        double disc = edna * 0.18;
        double finalprice = edna - disc;

        System.out.println("The final price is: " + finalprice + " lv.");
        System.out.println(("The discount is: " + disc + " lv."));
    }
}
