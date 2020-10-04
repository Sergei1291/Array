package com.epam.array.data.factory;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.DataParser;
import com.epam.array.data.impl.ConsoleArrayCreator;

public class ConsoleArrayCreatorFactory implements ArrayCreatorFactory {

    private final DataParser dataParser = new DataParser();

    @Override
    public ArrayCreator createArrayCreator() {

        return new ConsoleArrayCreator(dataParser);
    }

}