package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examhours = Integer.parseInt(scanner.nextLine());
        int examminutes = Integer.parseInt(scanner.nextLine());
        int comehours = Integer.parseInt(scanner.nextLine());
        int comeminutes = Integer.parseInt(scanner.nextLine());

        int examtimeminutes = examhours * 60 + examminutes;
        int arrivaltime = comehours * 60 + comeminutes;

        int timediff = arrivaltime - examtimeminutes;

        if (timediff > 0) {
            System.out.println("Late");
        } else if (timediff >= -30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }
        if (timediff != 0) {
            int hours = Math.abs(timediff) / 60;
            int min = Math.abs(timediff) % 60;
            if (hours > 0) {
                System.out.printf("%d:%02d hours %s the start\n", hours, min, timediff > 0 ? "after" : "before");
            } else {
                System.out.printf("%d minutes %s the start\n", min, timediff > 0 ? "after" : "before");
            }
        }
    }
}
