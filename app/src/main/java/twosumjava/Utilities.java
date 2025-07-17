package twosumjava;

import java.util.Scanner;

public class Utilities {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear the invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
