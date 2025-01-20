package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        String b = scanner.nextLine();

        if ("m".equals(b)) {
            if (x >= 16) {
                System.out.println("Mr.");
            } else System.out.println("Master");
        } else if ("f".equals(b)) {
            if (x >= 16) {
                System.out.println("Ms.");
            } else {
                    System.out.println("Miss");
            }
            }
        }
    }

