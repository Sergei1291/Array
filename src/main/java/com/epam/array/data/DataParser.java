package com.epam.array.data;

public class DataParser {

    private final static String SEPARATOR = "\\s+";

    public int[] parse(String data) {

        String[] stringResult = data.split(SEPARATOR);

        int[] result = new int[stringResult.length];

        for (int i = 0; i < stringResult.length; i++) {
            result[i] = Integer.parseInt(stringResult[i]);
        }

        return result;
    }

}