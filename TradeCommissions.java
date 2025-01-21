package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

        boolean vd = true;
        double result = 0;
        if (x.equals("Sofia")) {
            if (b >= 0 && b <= 500) {
                result = b * 0.05;
            } else if (b > 500 && b <= 1000) {
                result = b * 0.07;
            } else if (b > 1000 && b <= 10000) {
                result = b * 0.08;
            } else if (b > 10000) {
                result = b * 0.12;
            } else {
                vd  = false;
            }
        } else if (x.equals("Varna")) {
            if (b >= 0 && b <= 500) {
                result = b * 0.045;
            } else if (b > 500 && b <= 1000) {
                result = b * 0.075;
            } else if (b > 1000 && b <= 10000) {
                result = b * 0.10;
            } else if (b > 10000) {
                result = b * 0.13;
            } else {
                vd = false;
            }
            } else if (x.equals("Plovdiv")) {
            if (b >= 0 && b <= 500) {
                result = b * 0.055;
            } else if (b > 500 && b <= 1000) {
                result = b * 0.08;
            } else if (b > 1000 && b <= 10000) {
                result = b * 0.12;
            } else if (b > 10000) {
                result = b * 0.145;
            } else {
                vd = false;
            } } else {
            vd = false;
        }
            if (!vd) {
                System.out.println("error");
            } else {
             System.out.printf("%.2f", result); }}
    }

