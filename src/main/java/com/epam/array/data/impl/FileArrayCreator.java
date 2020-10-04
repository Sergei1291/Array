package com.epam.array.data.impl;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.DataException;
import com.epam.array.data.DataParser;
import com.epam.array.model.Array;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileArrayCreator implements ArrayCreator {

    private final String fileName;
    private final DataParser dataParser;

    public FileArrayCreator(String fileName, DataParser dataParser) {

        this.fileName = fileName;
        this.dataParser = dataParser;
    }

    @Override
    public Array create() {

        String data;
        int[] numbers;

        try {
            data = readFile(fileName);
            numbers = dataParser.parse(data);
        } catch (DataException e) {
            numbers = new int[0];
        }

        Array result = new Array(numbers);

        return result;
    }

    private String readFile(String fileName) throws DataException {

        FileReader reader = null;
        StringBuilder fileText = new StringBuilder();
        char[] currentSymbol = new char[1];

        try {

            reader = new FileReader(fileName);

            while (reader.read(currentSymbol) != (-1)) {
                fileText.append(currentSymbol);
            }

        } catch (FileNotFoundException e) {
            throw new DataException(e);
        } catch (IOException e) {
            throw new DataException(e);
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace(); // log
                }
            }

        }

        return new String(fileText);
    }

}