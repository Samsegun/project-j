package ConsoleMethods;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int totals = 0;

        while(true) {
            try {
                System.out.println("Enter a number (or any character to quit)");

                totals += Integer.parseInt(scanner.nextLine());
                counter++;

            } catch (NumberFormatException  | ArithmeticException e) {
                break;
            }
        }

        scanner.close();
        System.out.println("SUM = "+ totals + " AVG = " + Math.round((double) totals/counter));
    }
}
