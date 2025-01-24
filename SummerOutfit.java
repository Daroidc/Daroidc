package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();

        if (x >= 10 && x <=18) {
            if (b.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", x);
            } else if (b.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", x);
            } else if (b.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", x);
            }
        }
        if (x > 18 && x <= 24) {
            if (b.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", x);
            } else if (b.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", x);
            } else if (b.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", x);
            }
        }
        if (x >= 25) {
            if (b.equals("Morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", x);
            } else if (b.equals("Afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", x);
            } else if (b.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", x);
            }
        }
    }
}
