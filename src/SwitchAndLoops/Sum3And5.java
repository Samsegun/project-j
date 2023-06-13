package SwitchAndLoops;

public class Sum3And5 {

    public static void main(String[] args) {

        int counter = 0;
        int total = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0 && counter < 5) {

                total += i;
                System.out.println(i);
                counter++;

            }
        }
        System.out.println("Sum = " + total);
    }


}
