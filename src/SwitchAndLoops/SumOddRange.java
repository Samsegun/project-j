package SwitchAndLoops;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));

    }

    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {

        if((start <= 0 || end <= 0) || (end < start)) return -1;

        int oddTotals = 0;

        for (int i = start; i <= end; i++) {

            if(isOdd(i)) {
                oddTotals += i;
            }
        }

        return oddTotals;
    }
}
