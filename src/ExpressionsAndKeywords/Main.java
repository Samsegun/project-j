package ExpressionsAndKeywords;

public class Main {
    public static void main(String[] args) {

       int finalScore = calculateScore(true, 800, 5, 100);

//        calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score was " + finalScore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
