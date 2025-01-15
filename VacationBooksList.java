package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bs = Integer.parseInt(scanner.nextLine());
        int str = Integer.parseInt(scanner.nextLine());
        int bd = Integer.parseInt(scanner.nextLine());
        int obshtovr = bs / str;
        int neobh = obshtovr / bd;

        System.out.print(neobh);

    }
}
