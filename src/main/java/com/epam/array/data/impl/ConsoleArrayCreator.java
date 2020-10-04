package com.epam.array.data.impl;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.DataParser;
import com.epam.array.model.Array;

import java.util.Scanner;

public class ConsoleArrayCreator implements ArrayCreator {

    private final DataParser dataParser;

    public ConsoleArrayCreator(DataParser dataParser) {

        this.dataParser = dataParser;
    }

    @Override
    public Array create() {

        String data = readConsole();

        int[] numbers = dataParser.parse(data);

        Array result = new Array(numbers);

        return result;
    }

    private String readConsole() {

        Scanner scanner = null;
        String data;

        try {
            scanner = new Scanner(System.in);
            data = scanner.nextLine();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return data;
    }

}