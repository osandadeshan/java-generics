package com.osanda.generics;

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


class GenericClass<T> {

    private ArrayList<T> list = new ArrayList<>();

    private void addRecord(T elementName) {
        list.add(elementName);
    }

    private T printRecord(int elementIndex) {
        return list.get(elementIndex);
    }

    private void printRecords() {
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args) {
        // String names list
        GenericClass<String> namesList = new GenericClass<>();
        namesList.addRecord("Osanda");
        namesList.addRecord("Eranga");
        namesList.addRecord("Malindu");
        System.out.println("======== Names List ========");
        namesList.printRecords();
        System.out.println("2nd name of the names list is: " + namesList.printRecord(1));

        // Integers list
        GenericClass<Integer> numbersList = new GenericClass<>();
        numbersList.addRecord(1);
        numbersList.addRecord(2);
        numbersList.addRecord(3);
        System.out.println("\n");
        System.out.println("======== Number List ========");
        numbersList.printRecords();
        System.out.println("2nd number of the numbers list is: " + numbersList.printRecord(1));
    }


}
