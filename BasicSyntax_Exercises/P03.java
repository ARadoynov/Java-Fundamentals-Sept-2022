package BasicSyntax_Exercises;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (dayOfWeek.equals("Friday")) {

            if (typeOfGroup.equals("Students")) {
                if (people >= 30) {
                    price = (people * 8.45) * 0.85;
                } else {
                    price = people * 8.45;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (people >= 100) {
                    people = people - 10;
                }
                    price = people * 10.9;
            } else if (typeOfGroup.equals("Regular")) {
                if (people >= 10 && people <= 20) {
                    price = (people * 15) * 0.95;
                } else {
                    price = people * 15;
                }
            }

        } else if (dayOfWeek.equals("Saturday")) {

            if (typeOfGroup.equals("Students")) {
                if (people >= 30) {
                    price = (people * 9.80) * 0.85;
                } else {
                    price = people * 9.80;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (people >= 100) {
                    people = people - 10;
                }
                    price = people * 15.6;
            } else if (typeOfGroup.equals("Regular")) {
                if (people >= 10 && people <= 20) {
                    price = (people * 20) * 0.95;
                } else {
                    price = people * 20;
                }

            }
        } else if (dayOfWeek.equals("Sunday")) {

            if (typeOfGroup.equals("Students")) {
                if (people >= 30) {
                    price = (people * 10.46) * 0.85;
                } else {
                    price = people * 10.46;
                }
            } else if (typeOfGroup.equals("Business")) {
                if (people >= 100) {
                    people = people - 10;
                }
                    price = people * 16;
            } else if (typeOfGroup.equals("Regular")) {
                if (people >= 10 && people <= 20) {
                    price = (people * 22.5) * 0.95;
                } else {
                    price = people * 22.5;
                }
            }
        }

        System.out.printf("Total price: %.2f", price);
            }
        }
