package SwitchAndLoops;

public class EvenNumber {

    public static void main(String[] args) {

        int start = 5;
        int evenTotals = 0;
        int oddCount = 0;
        int evenCount = 0;

        while(start <= 20) {

            if(isEven(start)) {
                evenTotals += start;
                System.out.println(start);
                evenCount++;
            } else {
                oddCount++;
            }

            if(evenCount == 5) break;
            start++;
        }
        System.out.println("Even number total is " + evenCount);
        System.out.println("Odd number total is " + oddCount);
    }

    public static boolean isEven(int number) {
        return (number > 0 && number % 2 == 0);
    }
}
