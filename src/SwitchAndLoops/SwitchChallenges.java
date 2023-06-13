package SwitchAndLoops;

public class SwitchChallenges {

    public static void main(String[] args) {

        printNumberInWord(3);
    }

    public static void printNumberInWord(int number) {

        String value = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };

        String value1;
        switch (number) {
            case 0:
                value1 = "ZERO";
                break;
            case 1:
                value1 = "ONE";
                break;
            case 2:
                value1 = "TWO";
                break;
            case 3:
                value1 = "THREE";
                break;
            case 4:
                value1 = "FOUR";
                break;
            case 5:
                value1 = "FIVE";
                break;
            case 6:
                value1 = "SIX";
                break;
            case 7:
                value1 = "SEVEN";
                break;
            case 8:
                value1 = "EIGHT";
                break;
            case 9:
                value1 = "NINE";
                break;
            default :
                value1 = "OTHER";
                break;
        };

        System.out.println(value1);
    }
}
