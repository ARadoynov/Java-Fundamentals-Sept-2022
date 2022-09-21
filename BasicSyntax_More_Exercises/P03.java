package BasicSyntax_MoreExercises;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double initialBalance = balance;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {

            if (initialBalance == 0) {
                break;
            }

            switch (input) {
                case "OutFall 4":
                    if (initialBalance >= 39.99) {
                        initialBalance -= 39.99;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (initialBalance >= 15.99) {
                        initialBalance -= 15.99;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (initialBalance >= 19.99) {
                        initialBalance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (initialBalance >= 59.99) {
                        initialBalance -= 59.99;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (initialBalance >= 29.99) {
                        initialBalance -= 29.99;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (initialBalance >= 39.99) {
                        initialBalance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }


            input = scanner.nextLine();
        }

        if (initialBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", balance - initialBalance, initialBalance);
        } else {
            System.out.println("Out of money!");
        }

     }
}
