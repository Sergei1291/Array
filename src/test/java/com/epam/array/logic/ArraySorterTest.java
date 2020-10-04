package com.epam.array.logic;

import com.epam.array.model.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    private final ArraySorter arraySorter = new ArraySorter();

    @Test
    public void testSortShouldSort() {
        //given
        int[] numbersExpected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Array arrayExpected = new Array(numbersExpected);
        int[] numbers = new int[]{9, 1, 5, 6, 3, 7, 2, 8, 0, 4};
        Array array = new Array(numbers);
        //when
        Array actual = arraySorter.sort(array);
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testSortShouldReturnEqualArrayWhenLengthZero() {
        //given
        int[] numbersExpected = new int[0];
        Array arrayExpected = new Array(numbersExpected);
        int[] numbers = new int[0];
        Array array = new Array(numbers);
        //when
        Array actual = arraySorter.sort(array);
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testSortShouldReturnEqualArrayWhenLengthOne() {
        //given
        int[] numbersExpected = new int[]{50};
        Array arrayExpected = new Array(numbersExpected);
        int[] numbers = new int[]{50};
        Array array = new Array(numbers);
        //when
        Array actual = arraySorter.sort(array);
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testSortShouldReturnNewObject() {
        //given
        int[] numbers = new int[]{50};
        Array array = new Array(numbers);
        //when
        Array actual = arraySorter.sort(array);
        //then
        Assert.assertNotSame(array, actual);
    }

}