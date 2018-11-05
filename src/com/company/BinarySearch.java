package com.company;

import java.util.Scanner;


public class BinarySearch {
    int binarySearch(int value, int left, int right) {

        if (left > right)

            return -1;

        int middle = (left + right) / 2;
        if (middle == value)
            return middle;

        else if (middle > value) {
            System.out.println(middle+" jest za duza");
            return binarySearch(value, left, middle - 1);
        }

        else {
            System.out.println(middle + " jest za mala");
            return binarySearch(value, middle + 1, right);
        }

    }

    public BinarySearch(){

        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        int result = binarySearch(secretNumber,0,999);
        if (result == -1)
            System.out.println("Nie ma");
        else
            System.out.println("Znaleziono na pozycji " +
                    result);
    }

    public static void main(String[] args) {
        new BinarySearch();
    }

}
