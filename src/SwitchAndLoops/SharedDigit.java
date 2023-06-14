package SwitchAndLoops;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit (int a, int b) {

        if((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int check = b;
            while (a > 0) {
                int lastDigitA = a % 10;
                int lastDigitB = check % 10;

                if(lastDigitA == lastDigitB){
                    return true;
                }

                check /= 10;
                if(check == 0) {
                    a /= 10;
                    check = b;
                }
            }
            return false;
        }

        return false;
    }
}
