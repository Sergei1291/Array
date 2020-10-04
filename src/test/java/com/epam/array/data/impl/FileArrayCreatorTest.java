package com.epam.array.data.impl;

import com.epam.array.data.DataParser;
import com.epam.array.model.Array;
import org.junit.Assert;
import org.junit.Test;

public class FileArrayCreatorTest {

    private final static String DATA = "src/test/resources/dataFileArrayCreatorTest.txt";
    private final static String FILE_NOT_EXIST = "src/test/resources/doesNotExist.txt";

    private final DataParser dataParser = new DataParser();

    @Test
    public void testCreateShouldReturnEqualObject() {
        //given
        int[] numbersExpected = new int[]{15, 95, -5, 485, -10, 0};
        Array arrayExpected = new Array(numbersExpected);
        FileArrayCreator creator = new FileArrayCreator(DATA, dataParser);
        //when
        Array actual = creator.create();
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

    @Test
    public void testCreateShouldReturnEqualObjectWhenFileNotExist() {
        //given
        int[] numbersExpected = new int[0];
        Array arrayExpected = new Array(numbersExpected);
        FileArrayCreator creator = new FileArrayCreator(FILE_NOT_EXIST, dataParser);
        //when
        Array actual = creator.create();
        //then
        Assert.assertEquals(arrayExpected, actual);
    }

}