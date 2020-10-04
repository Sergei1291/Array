package com.epam.array.logic;

import com.epam.array.model.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySimpleNumberCreatorTest {

    private final ArraySimpleNumberCreator creator = new ArraySimpleNumberCreator();

    @Test
    public void testCreateShouldReturnEmptyArray() {
        //given
        int[] numbers = new int[]{-3, 0, 1, 4, -19, 10, 12, 14};
        Array array = new Array(numbers);
        int[] numbersExpected = new int[0];
        Array arrayExpected = new Array(numbersExpected);
        //when
        Array actual = creator.create(array);
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testCreateShouldReturnArray() {
        //given
        int[] numbersExpected = new int[]{2, 3, 5, 7, 11, 13, 17};
        Array arrayExpected = new Array(numbersExpected);
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        Array array = new Array(numbers);
        //when
        Array actual = creator.create(array);
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testCreateShouldReturnNewObject() {
        //given
        int[] numbers = new int[]{3, 5, 7, 11};
        Array array = new Array(numbers);
        //when
        Array actual = creator.create(array);
        //then
        Assert.assertNotSame(array, actual);
    }

}