package com.epam.array.logic;

import com.epam.array.model.Array;

public class ArraySorter {

    public Array sort(Array array) {

        int[] numbers = array.getArray();
        int numbersLength = array.getLength();

        mergeSort(numbers, 0, numbersLength - 1);

        Array sortedArray = new Array(numbers);

        return sortedArray;
    }

    private void mergeSort(int[] numbers, int lowBorder, int highBorder) {

        if (lowBorder < highBorder) { // numbers contains 2 or more elements

            int middle = (lowBorder + highBorder) / 2;

            mergeSort(numbers, lowBorder, middle); // recursion : sort first half
            mergeSort(numbers, middle + 1, highBorder); // recursion : sort second half
            merge(numbers, lowBorder, middle, highBorder); // merge both sorted halves
        }

    }

    private void merge(int[] numbers, int lowBorder, int middle, int highBorder) {

        int lengthTempArray = highBorder - lowBorder + 1;
        int[] temp = new int[lengthTempArray];

        int i = lowBorder;
        int j = middle + 1;
        int k = 0;

        while (i <= middle || j <= highBorder) {
            if (i > middle) {
                temp[k++] = numbers[j++];
            } else if (j > highBorder) {
                temp[k++] = numbers[i++];
            } else if (numbers[i] < numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        for (j = 0; j < lengthTempArray; j++) {
            numbers[lowBorder + j] = temp[j];
        }

    }

}