package SwitchAndLoops;

public class Loops {

    public static void main(String[] args) {

        for(double i = 7.5; i <= 10; i += 0.25) {

            System.out.println("Interest on $100 at " + i + "% is " + calculateInterest(100, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
