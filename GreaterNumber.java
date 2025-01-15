package FirstStepsInCodingExercise;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (x > b)
            System.out.println(x);
        else
            System.out.print(b);
    }
}
