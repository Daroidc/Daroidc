package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();

        if (x >=10 && x <=18) {
          if (b.equals("Monday")) {
        } else if (b.equals("Tuesday")) {
        } else if (b.equals("Wednesday")) {
        } else if (b.equals("Thursday")) {
        } else if (b.equals("Friday")) {
        } else if (b.equals("Saturday")) {
              System.out.println("open");
          }
            } else {
            System.out.println("closed");
        }
    }
}
