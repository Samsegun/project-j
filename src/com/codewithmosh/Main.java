package com.codewithmosh;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        Date now = new Date();
//
//        System.out.println(age);
//        System.out.println(viewsCount);
//        System.out.println(price);
//        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;

        point1.x = 2;
        System.out.println(point2);

//        String message = "Hello World!!";
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
        String message = "c:\\windows\\...";
        System.out.println(message);

        int[] numbers = {2,5,4,1,7,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        int[][] nestedNumbers = new int[2][4];
        int[][] nestedNumbers = {{2,3,4}, {5,6}};
        System.out.println("Length of nestedNumbers array is = " + nestedNumbers.length);
        System.out.println(Arrays.deepToString(nestedNumbers));

//        constants
        final float PI = 3.14F;
        System.out.println(PI);
    }
}
