package com.epam.array.view;

import com.epam.array.model.Array;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinterTest {

    private final static String OUTPUT_FOR_TEST = "src/test/resources/outputFilePrinterTest.txt";

    @Test
    public void testPrintShouldWriteFile() throws ViewException {
        //given
        int[] numbers = new int[]{4, -56, 100};
        Array array = new Array(numbers);
        FilePrinter filePrinter = new FilePrinter(OUTPUT_FOR_TEST);
        //when
        filePrinter.print(array);
        //then
        String expected = new String("4 -56 100 ");
        String actual = readFile(OUTPUT_FOR_TEST);
        Assert.assertEquals(expected, actual);
    }

    private String readFile(String fileName) {

        FileReader reader = null;
        StringBuilder fileTextBuilder = new StringBuilder();
        char[] currentSymbol = new char[1];

        try {

            reader = new FileReader(fileName);

            while (reader.read(currentSymbol) != (-1)) {
                fileTextBuilder.append(currentSymbol);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return new String(fileTextBuilder);
    }

}