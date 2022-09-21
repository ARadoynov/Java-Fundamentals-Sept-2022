package BasicSyntax;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int innitHour = Integer.parseInt(scanner.nextLine());
        int innitMins = Integer.parseInt(scanner.nextLine());

        int totalMins = (innitHour * 60) + innitMins + 30;

        int hours = totalMins / 60;
        int mins = totalMins % 60;

        if (hours > 23) {
            hours = 0;
        }
        String textResult = String.format("%d:%02d", hours, mins);
        System.out.println(textResult);
    }
}
