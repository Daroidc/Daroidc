package ConditionalStatementsLab;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metri = Double.parseDouble(scanner.nextLine());
        double vremevsec = Double.parseDouble(scanner.nextLine());

        double timeforswiming = metri * vremevsec;

        double sectors = Math.floor(metri / 15);
        double zabavqne = sectors * 12.5;

        timeforswiming = timeforswiming + zabavqne;

        if (timeforswiming < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeforswiming);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeforswiming - record);
        }

    }
}
