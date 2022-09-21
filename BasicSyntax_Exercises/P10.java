package BasicSyntax_Exercises;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());

        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(countStudents + 0.10 * countStudents) * priceLightSabers;
        double sumRobes = countStudents * priceRobes;
        double sumBelts = (countStudents - countStudents / 6) * priceBelts;

        double sum = sumLight + sumRobes + sumBelts;
        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }
   }
}
