package SwitchAndLoops;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(23476544));
    }

    public static int getEvenDigitSum (int number) {

        if(number < 0) return -1;

        int evenSum = 0;

        while(number > 0) {
            int lastDigit = number % 10;

            if(lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }

            number /= 10;
        }

        return  evenSum;
    }
}
