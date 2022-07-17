package Homework;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

public class Tema5 {
    //Write a Java program to remove the duplicate elements of a given array
    // and return the new length of the array.
    //Sample array: [20, 20, 30, 40, 50, 50, 50]
    @Test
    public void removeDuplicate() {
        Integer[] num = {20, 20, 30, 40, 50, 50};
        System.out.println(" Original array length: " + num.length);
        System.out.print("Array elements are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


    }


}
