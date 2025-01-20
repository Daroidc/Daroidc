package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WeekendorWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        switch (x) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Working day");
                break;
            case "Saturday", "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
