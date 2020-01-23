package com.osanda.notgenerics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project Name    : generics
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 1/12/2020
 * Time            : 6:57 PM
 * Description     :
 **/


class CustomList {

    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<Integer> integerList = new ArrayList<>();

    private void addRecord(String elementName) {
        stringList.add(elementName);
    }

    private void addRecord(int number) {
        integerList.add(number);
    }

    private void printStringsList() {
        System.out.println(Arrays.toString(stringList.toArray()));
    }

    private String printStringRecord(int elementIndex) {
        return stringList.get(elementIndex);
    }

    private void printIntegersList() {
        System.out.println(Arrays.toString(integerList.toArray()));
    }

    private int printIntegerRecord(int elementIndex) {
        return integerList.get(elementIndex);
    }

    public static void main(String[] args) {
        // String names list
        CustomList namesList = new CustomList();
        namesList.addRecord("Osanda");
        namesList.addRecord("Eranga");
        namesList.addRecord("Malindu");
        System.out.println("======== Names List ========");
        namesList.printStringsList();
        System.out.println("2nd name of the names list is: " + namesList.printStringRecord(1));

        // Integers list
        CustomList numbersList = new CustomList();
        numbersList.addRecord(1);
        numbersList.addRecord(2);
        numbersList.addRecord(3);
        System.out.println("\n");
        System.out.println("======== Number List ========");
        numbersList.printIntegersList();
        System.out.println("2nd number of the numbers list is: " + numbersList.printIntegerRecord(1));
    }


}
