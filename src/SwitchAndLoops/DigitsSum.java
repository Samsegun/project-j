package SwitchAndLoops;

public class DigitsSum {
//    static int op = 2;
    public static void main(String[] args) {

        System.out.println(sumDigits(3214));
    }

    public static int sumDigits(int number) {

        if(number < 0) return -1;

        String strNum = String.valueOf(number);
        int digitSum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            digitSum += Character.getNumericValue(strNum.charAt(i));
        }

        return digitSum;
    }
}

