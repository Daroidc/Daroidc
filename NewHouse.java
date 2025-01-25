package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double pricePerFlower = 0;

        switch (flowerType) {
            case "Roses":
                pricePerFlower = 5.00;
                break;
            case "Dahlias":
                pricePerFlower = 3.80;
                break;
            case "Tulips":
                pricePerFlower = 2.80;
                break;
            case "Narcissus":
                pricePerFlower = 3.00;
                break;
            case "Gladiolus":
                pricePerFlower = 2.50;
                break;
        }

        double totalPrice = pricePerFlower * flowerCount;

        if (flowerType.equals("Roses") && flowerCount > 80) {
            totalPrice *= 0.90;
        } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
            totalPrice *= 0.85;
        } else if (flowerType.equals("Tulips") && flowerCount > 80) {
            totalPrice *= 0.85;
        } else if (flowerType.equals("Narcissus") && flowerCount < 120) {
            totalPrice *= 1.15;
        } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
            totalPrice *= 1.20;
        }

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n",
                    flowerCount, flowerType, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.%n", totalPrice - budget);
           }
        }
    }

