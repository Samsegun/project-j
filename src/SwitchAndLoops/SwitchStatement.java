package SwitchAndLoops;

public class SwitchStatement {

    public static void main(String[] args) {
//        System.out.println("Enter a character between A-E");
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.next();
//
//        scanner.close();

//        traditional switch statement
//        switch (value.toUpperCase()) {
//            case "A":
//                System.out.println("Able");
//                break;
//            case "B":
//                System.out.println("Baker");
//                break;
//            case "C":
//                System.out.println("Charlie");
//                break;
//            case "D":
//                System.out.println("Dog");
//                break;
//            case "E":
//                System.out.println("Easy");
//                break;
//            default:
//                System.out.println(value + " not found!");
//                break;
//        }

        printDayOfWeek(90);
    }

    public static void printDayOfWeek(int day) {
//      enhanced switch expression
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("Day " + day + " of the week is " + dayOfTheWeek);
    }
}
