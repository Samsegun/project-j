package ConsoleMethods;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;

        while(true) {
            try {
                System.out.println("Enter a number (or any character to quit)");

                double userInput = Double.parseDouble(scanner.nextLine());

                if(max < userInput) {
                    max = userInput;
                } else if (userInput < max) {
                    min = userInput;
                }

            } catch (NumberFormatException badInput) {
                break;
            }
        }

        scanner.close();

        System.out.println("minimum entered number is = " + min );
        System.out.println("maximum entered number is = " + max );


    }
}
