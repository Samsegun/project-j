package SwitchAndLoops;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(123);
    }

    public static void numberToWords (int number) {

        if(number < 0) System.out.println("Invalid Value");

        int reversedNumber = reverse(number);
        for(int i = 0; i < getDigitCount(number); i++) {

            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }

            reversedNumber /= 10;

        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        int newNumber;
        if(number < 0){
            newNumber = number * -1;
        }else {
            newNumber = number;
        }

        while(newNumber > 0) {
            int lastDigit = newNumber % 10;

            reversedNumber *= 10;
            reversedNumber += lastDigit;
            newNumber /= 10;
        }

        if(number < 0) reversedNumber *= -1;

        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if(number < 0) return -1;
        if(number == 0) return 1;

        int count = 0;
        while(number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
