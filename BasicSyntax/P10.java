package BasicSyntax;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
    }
}

//        int n = Integer.parseInt(scanner.nextLine());
//        int times = 1;
//
//        while (times <= 10) {
//            System.out.printf("%d X %d = %d%n", n, times, n * times);
//            times++;
//        }
//    }
//}
