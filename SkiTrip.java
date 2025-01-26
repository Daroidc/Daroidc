package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();

        double roomforone = 18;
        double apartment = 25;
        double president = 35;

        double totalroomforone = (days - 1) * roomforone;
        double totalapartment = (days - 1) * apartment;
        double totalpresident = (days - 1) * president;

        if (days < 10) {
            if (room.equals("apartment")) {
                totalapartment = totalapartment - (totalapartment * 0.30);
            }
        } if (days > 10 && days < 15) {
            if (room.equals("apartment")) {
                totalapartment = totalapartment - (totalapartment * 0.35);
            }
        } if (days > 15) {
            if (room.equals("apartment")) {
                totalapartment = totalapartment - (totalapartment * 0.50);
            }
        } if (days < 10) {
            if (room.equals("president apartment")) {
                totalpresident = totalpresident - (totalpresident * 0.10);
            }
        } if (days > 10 && days < 15) {
            if (room.equals("president apartment")) {
                totalpresident = totalpresident - (totalpresident * 0.15);
            }
        } if (days > 15) {
            if (room.equals("president apartment")) {
                totalpresident = totalpresident - (totalpresident * 0.20);
            }
        } if (rate.equals("positive")) {
            totalapartment = totalapartment + (totalapartment * 0.25);
            totalpresident = totalpresident + (totalpresident * 0.25);
            totalroomforone = totalroomforone + (totalroomforone * 0.25);
        } else if (rate.equals("negative")) {
            totalapartment = totalapartment - (totalapartment * 0.10);
            totalpresident = totalpresident - (totalpresident * 0.10);
            totalroomforone = totalroomforone - (totalroomforone * 0.10);
        } if (room.equals("room for one person")) {
            System.out.printf("%.2f", totalroomforone);
        } else if (room.equals("apartment")) {
            System.out.printf("%.2f", totalapartment);
        } else if (room.equals("president apartment")) {
            System.out.printf("%.2f", totalpresident);
        }
    }
}