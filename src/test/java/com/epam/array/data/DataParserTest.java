package com.epam.array.data;

import org.junit.Assert;
import org.junit.Test;

public class DataParserTest {

    private final DataParser dataParser = new DataParser();

    @Test(expected = NumberFormatException.class) //then
    public void testParseShouldTrowNumberFormatExceptionWhenDataLong() {
        //given
        String data = "1 2 12312312308098340961";
        // when
        int[] actual = dataParser.parse(data);
    }

    @Test(expected = NumberFormatException.class) //then
    public void testParseShouldTrowNumberFormatExceptionWhenDataString() {
        //given
        String data = "1 2h12 123";
        // when
        int[] actual = dataParser.parse(data);
    }

    @Test
    public void testParseShouldReturnArray() {
        //given
        int[] expected = new int[]{1, -2, 12, -165, -50};
        String data = "1 -2 \n12 -165 \t-50";
        // when
        int[] actual = dataParser.parse(data);
        //then
        Assert.assertArrayEquals(expected, actual);
    }

}