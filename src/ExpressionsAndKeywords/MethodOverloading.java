package ExpressionsAndKeywords;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8) + " cm");
        System.out.println(convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        return  heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        double inchesToFeet = heightInInches / 12d;
        double totalHeightInFeet = heightInFeet + inchesToFeet;
        int totalHeightInInches = (int) (totalHeightInFeet * 12);

        return convertToCentimeters(totalHeightInInches);
    }
}
