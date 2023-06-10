public class SpeedConverter {

    static double conversionRate = 1.609;

    public static void main(String[] args) {
        printConversion(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long roundedMiles = -1;

        if(kilometersPerHour < 0) {
            return roundedMiles;
        }

        double milesPerHour = kilometersPerHour / conversionRate;
        roundedMiles =  Math.round(milesPerHour);
        return roundedMiles;
    }

    public static void printConversion (double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(milesPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
