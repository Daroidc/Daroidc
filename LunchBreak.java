package ConditionalStatementsLab;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int epizod = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double vremezaobqd = rest / 8.0;
        double vremezaotdih = rest / 4.0;

        double resttot = rest - vremezaobqd - vremezaotdih;

        double difftime = Math.abs(resttot - epizod);

        if (resttot >= epizod) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(difftime) );
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(difftime) );
        }
    }
}
