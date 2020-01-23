package com.osanda.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Project Name    : generics
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 1/19/2020
 * Time            : 9:40 PM
 * Description     :
 **/


public class UpperBoundedWildCard {

    // Upper bounded wildcard
    // This helps to implement common logic for lists which are extending number
    private static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of integer list: " + sumOfNumberList(Arrays.asList(1, 2, 3, 4, 5))); // Adding integer values
        System.out.println("Sum of float list: " + sumOfNumberList(Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1))); // Adding floating values
        System.out.println("Sum of long list: " + sumOfNumberList(Arrays.asList(1L, 2L, 3L, 4L, 5L))); // Adding long values
    }


}
