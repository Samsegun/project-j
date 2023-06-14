package SwitchAndLoops;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome (int number) {

//        turn negative numbers to positive
        if(number < 0) number *= -1;

        int mainNum = number;
        int reversedNumber = 0;

        while (mainNum > 0) {
            int lastDigit = mainNum % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            mainNum = mainNum / 10;

        }

        return (number == reversedNumber);

    }
}
