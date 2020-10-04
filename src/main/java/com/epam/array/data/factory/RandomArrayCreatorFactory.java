package com.epam.array.data.factory;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.impl.RandomArrayCreator;

public class RandomArrayCreatorFactory implements ArrayCreatorFactory {

    @Override
    public ArrayCreator createArrayCreator() {

        return new RandomArrayCreator();
    }

}