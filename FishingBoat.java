package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double rent = 0;
        switch (season) {
            case "Spring" -> rent = 3000.0;
            case "Summer", "Autumn" -> rent = 4200.0;
            case "Winter" -> rent = 2600.0;
        }
        if (fishers <= 6) {
            rent = rent - (rent * 0.10);
        } else if (fishers <= 11) {
            rent = rent - (rent * 0.15);
        } else {
            rent = rent - (rent * 0.25);
        }

        if (fishers % 2 == 0 && !(season.equals("Autumn"))) {
            rent = rent - (rent * 0.05);
        }
        double diff = Math.abs(budget - rent);
        if (budget > rent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
