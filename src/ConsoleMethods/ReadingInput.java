package ConsoleMethods;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        int year = 2023;
        int age = year - Integer.parseInt(getInputFromConsole(year));

        System.out.println("Age = " + age);

    }

    public static String getInputFromConsole(int year) {

//        String age = System.console().readLine("Hi, please enter birth year: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, please enter birth year: ");

        String age = scanner.nextLine();
        scanner.close();

        return age;
    }
}
