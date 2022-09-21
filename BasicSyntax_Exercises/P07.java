package BasicSyntax_Exercises;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceNuts = 2.0;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1.0;
        double insertedCoins = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double currentCoins = Double.parseDouble((input));

            if (currentCoins != 0.10 && currentCoins != 0.2 && currentCoins != 0.5
                                     && currentCoins != 1.0 && currentCoins != 2) {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            } else {
                insertedCoins += currentCoins;
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            String wantedProduct = input;

            if (wantedProduct.equals("Nuts")) {

                if (insertedCoins >= priceNuts) {
                    insertedCoins = insertedCoins - priceNuts;
                    System.out.printf("Purchased %s%n", wantedProduct);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (wantedProduct.equals("Water")) {

                if (insertedCoins >= priceWater) {
                    insertedCoins = insertedCoins - priceWater;
                    System.out.printf("Purchased %s%n", wantedProduct);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (wantedProduct.equals("Crisps")) {

                if (insertedCoins >= priceCrisps) {
                    insertedCoins = insertedCoins - priceCrisps;
                    System.out.printf("Purchased %s%n", wantedProduct);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (wantedProduct.equals("Soda")) {

                if (insertedCoins >= priceSoda) {
                    insertedCoins = insertedCoins - priceSoda;
                    System.out.printf("Purchased %s%n", wantedProduct);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (wantedProduct.equals("Coke")) {

                if (insertedCoins >= priceCoke) {
                    insertedCoins = insertedCoins - priceCoke;
                    System.out.printf("Purchased %s%n", wantedProduct);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }

        if (insertedCoins >= 0) {
            System.out.printf("Change: %.2f", insertedCoins);
        }
    }
}

