package SwitchAndLoops;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(189,201,38));
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(isValid(a) && isValid(b) && isValid(c)) {

                 a %= 10;
                 b %= 10;
                 c %= 10;

            return (a == b) || (a == c) || (b == c);

        }

        return false;
    }

}
