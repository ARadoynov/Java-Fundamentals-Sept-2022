package BasicSyntax;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(num));



//        while (true) {
//            int num = Integer.parseInt(scanner.nextLine());
//            if (num % 2 != 0) {
//                System.out.println("Please write an even number.");
//            } else {
//                System.out.printf("The number is: %d", Math.abs(num));
//                break;
//            }
//        }
    }
}