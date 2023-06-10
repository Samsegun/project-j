
public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        int param1 = (int) (num1 * 1000);
        int param2 = (int) (num2 * 1000);

        if((param1 - param2) == 0) {
            return true;
        }

        return false;
    }
}
