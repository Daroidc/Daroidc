package ConditionalStatementsLab;

import java.util.Scanner;

public class Timeplus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chas = Integer.parseInt(scanner.nextLine());
        int minuti = Integer.parseInt(scanner.nextLine());


        int newminutes = minuti + 15;

        if (newminutes >= 60) {
            newminutes = newminutes - 60;
            chas = chas + 1;
        }
        if (chas > 23) {
            chas = 0;
        }

        System.out.printf("%d:%02d", chas, newminutes);


    }
}
