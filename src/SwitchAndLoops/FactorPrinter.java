package SwitchAndLoops;

public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(10);
    }

    public static void printFactors (int number) {

        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int counter = 1;
        while (counter <= number) {

            if(number % counter == 0) {
                System.out.println(counter);
            }

            counter++;
        }
    }
}
