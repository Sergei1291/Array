package com.epam.array.view;

import com.epam.array.model.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    private final String fileName;

    public FilePrinter(String fileName) {

        this.fileName = fileName;
    }

    @Override
    public void print(Array array) throws ViewException {

        BufferedWriter bufferedWriter = null;
        int[] numbers = array.getArray();

        try {

            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            String resultString = transformArrayToString(numbers);
            bufferedWriter.write(resultString);

        } catch (IOException e) {
            throw new ViewException(e);
        } finally {

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace(); //log
                }
            }

        }

    }

    private String transformArrayToString(int[] numbers) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            builder.append(numbers[i]);
            builder.append(" ");
        }

        return new String(builder);
    }

}