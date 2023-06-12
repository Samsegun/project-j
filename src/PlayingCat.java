public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 350));
    }

    public static boolean isCatPlaying (boolean summer, int temperature ) {
        int upperLimit = summer ? 45 : 35;

        return (temperature >= 25 && temperature <= upperLimit);

    }
}
