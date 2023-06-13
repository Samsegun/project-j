package SwitchAndLoops;

public class PrimeNumbers {

    public static void main(String[] args) {

        int primeCounter = 0;
        for(int i = 10; i <= 1000; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCounter++;

                if (primeCounter == 3) {
                    System.out.println("Found 3 prime numbers - Exiting loop.");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number) {

        if(number < 2) return false;

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
