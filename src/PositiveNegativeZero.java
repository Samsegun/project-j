public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(210);
    }

    public static void checkNumber(int number) {
        String result = number > 0 ? "positive" : (number < 0 ? "negative" : "zero");
        System.out.println(result);

//        if(number > 0) {
//            System.out.println("positive");
//        } else if (number < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }
    }
}
