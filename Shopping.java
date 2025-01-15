package ConditionalStatementsLab;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bujdet = Double.parseDouble(scanner.nextLine());
        int videokarti = Integer.parseInt(scanner.nextLine());
        int procesori = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videokartacena = 250.0;
        double videokartitot = videokarti * videokartacena;
        double procesorcena = videokartitot * 0.35;
        double procesortot = procesori * procesorcena;
        double ramcena = videokartitot * 0.10;
        double ramtot = ram * ramcena;

        double totalcena = videokartitot + procesortot + ramtot;

        if (videokarti > procesori) {
            totalcena = totalcena - (totalcena * 0.15);
        }


        if (bujdet > totalcena) {
            System.out.printf("You have %.2f leva left!", bujdet - totalcena);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalcena - bujdet);
        }

    }
}
