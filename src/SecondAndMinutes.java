public class SecondAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDuration(3945));
    }

    public static String getDuration(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int secs = seconds % 60;

            return getDuration(minutes, secs);
        }
        return "One or more invalid values entered";

    }

    public static String getDuration(int minutes, int seconds) {

        if (minutes >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            return (hours + "h" + " " + remainingMinutes + "m" + " " + seconds + "s");
        }
        return "One or more invalid values entered";

    }
}
