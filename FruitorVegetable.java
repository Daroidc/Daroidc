package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        switch (x) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes":
                System.out.println("fruit");
                break;
            case "tomato", "cucumber", "pepper", "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
