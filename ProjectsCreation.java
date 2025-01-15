package FirstStepsInCodingExercise;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Daniel  = scanner.nextLine();
        int project = 3;
        String Neobh;
        int broi = Integer.parseInt(scanner.nextLine());

        System.out.print("The architect " + Daniel + " will need " + broi*3 + " hours to complete " + broi + " project/s.");

    }
}
