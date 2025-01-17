package ConditionalStatementsLab;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumb = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int cactusi = Integer.parseInt(scanner.nextLine());
        double giftprice = Double.parseDouble(scanner.nextLine());

        double magnoliiprice = magnolii * 3.25;
        double zumbprice = zumb * 4.00;
        double roziprice = rozi *  3.50;
        double cactusprice = cactusi * 8.00;
        double totalprice = magnoliiprice + zumbprice + roziprice + cactusprice;
        double total = totalprice - (totalprice * 0.05);

        if (giftprice > total) {
            int nedostignali = (int) Math.ceil(giftprice - total);
            System.out.printf("She will have to borrow %d leva.", nedostignali);
        } else {
            int sec = (int) Math.floor(total - giftprice);
            System.out.printf("She is left with %d leva.", sec);
        }

    }
}
