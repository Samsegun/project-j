package ConsoleMethods;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        int counter = 1;
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Enter number #" + counter + ":");
                double currentNumber = Double.parseDouble(scanner.nextLine());
                total += currentNumber;

                counter++;
            } catch (NumberFormatException badInput) {
                System.out.println("Invalid number");
            }
        } while(counter <= 5);


        System.out.println("Total is " + total);
        scanner.close();

    }

}
