package FirstStepsInCodingExercise;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        //Преобразуваме ги в сантиметри
        int acm = (int) (a * 100);
        int bcm = (int) (b * 100);

        //Ширината на едно работно място и коридора
        int shirmasa = 70;
        int shirstol = 120;
        int koridor = 100;

        //Изчисляваме броя на работните места в ред и колона
        int red = (acm - koridor) / shirmasa;
        int kolona = bcm / shirstol;

        int obshto = (red * kolona) - 3;
        System.out.print(obshto);

    }
}
