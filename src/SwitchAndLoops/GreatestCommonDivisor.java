package SwitchAndLoops;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) return -1;

        int base = Math.min(first, second);
        int greatestDivisor = 0;

        for (int i = 1; i <= base; i++) {
            if(first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;

    }
}
