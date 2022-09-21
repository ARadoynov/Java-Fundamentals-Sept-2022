package BasicSyntax_Exercises;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isOver = false;

        double sum = 0;
        double totalSum = sum;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            sum = ((days * countCapsules) * pricePerCapsule);

            if (n > 1) {
                totalSum += sum;
                System.out.printf("The price for the coffee is: $%.2f%n", sum);
                isOver = true;
            } else {
                System.out.printf("The price for the coffee is: $%.2f%n", sum);
                System.out.printf("Total: $%.2f", sum);
            }

        }
        if (isOver) {
            System.out.printf("Total: $%.2f", totalSum);
        }
    }
}
