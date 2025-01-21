package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        if (x.equals("Monday")) {
            System.out.println("12");
        } else if (x.equals("Tuesday")) {
            System.out.println("12");
        } else if (x.equals("Wednesday")) {
            System.out.println("14");
        } else if (x.equals("Thursday")) {
            System.out.println("14");
        } else if (x.equals("Friday")) {
            System.out.println("12");
        } else if (x.equals("Saturday")) {
            System.out.println("16");
        } else if (x.equals("Sunday")) {
            System.out.println("16");
        }
    }
}
