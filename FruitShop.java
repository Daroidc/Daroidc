package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String b = scanner.nextLine();
        double c = Double.parseDouble(scanner.nextLine());

        double price = 0.00;
        boolean vp = true;

        switch (b) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                switch (x) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        vp = false;
                        break;
                }
                break;
          case "Saturday", "Sunday":
          switch (x) {
              case "banana":
                  price = 2.70;
                  break;
              case "apple":
                  price = 1.25;
                  break;
              case "orange":
                  price = 0.90;
                  break;
              case "grapefruit":
                  price = 1.60;
                  break;
              case "kiwi":
                  price = 3.00;
                  break;
              case "pineapple":
                  price = 5.60;
                  break;
              case "grapes":
                  price = 4.20;
                  break;
          }
          break;
            default:
          vp = false;
          break;
        }
        if (vp) {
            double total = price * c;
            System.out.printf("%.2f", total);
        } else {
            System.out.println("error");
        }
    }
}
