package codewars;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        int number = 421458302;
        System.out.println(sortDesc(number));
    }
    /* Useful methods:
        1. String.valueOf(int): Converts an int to a String
        2. Integer.parseInt(String): Converts a String to an Integer
        3. String.split(delimiter): Splits a String on the specified delimiter and returns an array
        4. Arrays.sort(array, Collections.reverseOrder()): Sorts array in reverse order
        5. String.join(delimiter, array): Create a String from an array, splitting each
           element in the array with a delimiter
     */
    public static int sortDesc(final int num) {
        String[] numArray = String.valueOf(num).split("");
        Arrays.sort(numArray, Collections.reverseOrder());
        return Integer.valueOf(String.join("", numArray));
    }
}
