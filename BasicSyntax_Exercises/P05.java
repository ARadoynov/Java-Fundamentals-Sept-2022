package BasicSyntax_Exercises;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String requiredPass = "";
        for (int position = username.length() - 1; position >= 0 ; position--) {
            char letter = username.charAt(position);
            requiredPass += letter;
        }

        int countWrongPass = 0;

        String currentPass = scanner.nextLine();
        while (!currentPass.equals(requiredPass)) {

            countWrongPass++;
            if (countWrongPass == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            currentPass = scanner.nextLine();
        }
        if (currentPass.equals(requiredPass)) {
            System.out.printf("User %s logged in.",username);
        }
    }
}
