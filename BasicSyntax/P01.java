package BasicSyntax;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        String textResult = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
        System.out.println(textResult);

    }
}
