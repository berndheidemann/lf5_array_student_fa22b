package arrayCalculator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCalculator {
    public int[] duplicateArrayValues(int[] array) {
        if (array == null) {
            return null;
        }
        // Die Werte des Arrays "array" verdoppeln
        for (int i = 0; i < array.length; i++) {
            int value = array[i] * 2;
            array[i] = value;
        }
        return array;
    }

    public int[] sumArrays(int[] array1, int[] array2) throws IllegalArgumentException {
        if (array1 == null || array2 == null) {
            return null;
        }
        if (array1.length != array2.length) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    public int[] swapArrays(int[] array) {
        if (array == null) {
            return null;
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int reverseIndex = array.length - 1 - i;
            // angenommen Array hat 10 Elemente
            // 1. Durchlauf: 10-1-0 --> 9
            // 2. Durchlauf: 10-1-1 --> 8
            // 3. Durchlauf: 10-1-2 --> 7
            result[reverseIndex] = array[i];
        }
        return result;
    }

    public int sumEven(int[] array) {
        if (array == null) {
            return 0;
        }
        // Summe der geraden Elemente liefern
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                // 7%2 --> 1
                // 23%10 --> 3
                // 101%100 --> 1
                sum += array[i];
            }
        }
        return sum;
    }

    public int[] getLargestTwo(int[] array) throws IllegalArgumentException {
        if (array == null) {
            return null;
        }
        if (array.length <= 1) {
            throw new IllegalArgumentException();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (val >= largest) {
                secondLargest = largest;
                largest = val;
            } else if (val >= secondLargest) {
                secondLargest = val;
            }
        }
        return new int[]{largest, secondLargest};
    }
}
