public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) return -1;

        int primeTotal = 1;
        for (int i = 2; i < number; i++) {

            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (number % i == 0 && isPrime) {

                if (i > primeTotal) primeTotal = i;

            }
        }
        if (primeTotal == 1) primeTotal = number;

        return primeTotal;
    }


}
