package SwitchAndLoops;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(2));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;

        String strNum = String.valueOf(number);
        int lastNum = strNum.charAt(strNum.length() - 1);
        int firstNum = strNum.charAt(0);
        int firstAndLastDigitSum = Character.getNumericValue(lastNum)
                + Character.getNumericValue(firstNum);

        return firstAndLastDigitSum;
    }
}
