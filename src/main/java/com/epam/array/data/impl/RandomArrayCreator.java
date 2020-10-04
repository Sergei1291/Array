package com.epam.array.data.impl;

import com.epam.array.data.ArrayCreator;
import com.epam.array.model.Array;

import java.util.Random;

public class RandomArrayCreator implements ArrayCreator {

    private final static int MAX_LENGTH_ARRAY = 20;

    @Override
    public Array create() {

        Random random = new Random();
        int lengthArray = (int) (Math.random() * MAX_LENGTH_ARRAY);

        Array array = new Array(lengthArray);

        for (int i = 0; i < lengthArray; i++) {
            array.setArray(random.nextInt(), i);
        }

        return array;
    }

}