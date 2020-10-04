package com.epam.array.data.factory;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.DataParser;
import com.epam.array.data.impl.FileArrayCreator;

public class FileArrayCreatorFactory implements ArrayCreatorFactory {

    private final static String FILE_DATA_INPUT = "data.txt";
    private final DataParser dataParser = new DataParser();

    @Override
    public ArrayCreator createArrayCreator() {

        return new FileArrayCreator(FILE_DATA_INPUT, dataParser);
    }

}