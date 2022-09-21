package BasicSyntax_Exercises;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countDisplay = lostGames / 12;

        double sum =  (countHeadset * priceHeadset)
                    + (countMouse * priceMouse)
                    + (countKeyboard * priceKeyboard)
                    + (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
