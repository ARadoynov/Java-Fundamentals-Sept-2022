package BasicSyntax_Exercises;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int number = inputNum;

        int sumFact = 0;

        while (number > 0) {
            int lastNum = number % 10;  // взимане на последното число

            int fact = 1;
            for (int i = 1 ; i <= lastNum ; i++) {   // изчисляваме фактуриела на последното число с for цикъл
                fact = fact * i;
            }
            sumFact += fact;     // събираме резултата от фактуриела на последното число към обща сума

            number = number / 10;   // премахваме последното число и променяме цялата стойност на променливата
        }
        if (sumFact == inputNum) {   //проверяваме дали сумата е равна на въведеното число от входните данни

            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}

