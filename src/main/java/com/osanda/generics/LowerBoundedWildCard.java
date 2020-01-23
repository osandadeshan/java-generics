package com.osanda.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project Name    : generics
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 1/19/2020
 * Time            : 9:52 PM
 * Description     :
 **/


public class LowerBoundedWildCard {

    // Lower bounded wildcard
    // This helps to add different types to a list which are sub types of number
    private static void addValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1L);
    }

    public static void main(String[] args) {
        List emptyList = new ArrayList<Number>();
        addValues(emptyList);
        System.out.println("Array list of different sub types of number: " + emptyList);
    }


}