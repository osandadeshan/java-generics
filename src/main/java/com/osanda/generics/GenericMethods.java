package com.osanda.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Project Name    : generics
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 1/19/2020
 * Time            : 8:13 PM
 * Description     :
 **/


public class GenericMethods {

    private static <X> X getValue(X value) {
        return value;
    }

    private static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    public static void main(String[] args) {
        System.out.println(getValue(5));
        System.out.println(getValue("Osanda"));

        // Duplicate an integer type array list
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        duplicate(arrayList);
        System.out.println("Duplicated array list: " + arrayList);

        // Duplicate an integer type linked list
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        duplicate(linkedList);
        System.out.println("Duplicated linked list: " + linkedList);
    }


}
