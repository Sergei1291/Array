package com.epam.array.logic;

import com.epam.array.model.Array;

public class ArraySimpleNumberCreator {

    public Array create(Array data) {

        int quantitySimpleNumbers = findQuantitySimpleNumbers(data);

        Array result = new Array(quantitySimpleNumbers);

        initializeArrayResult(result, data);

        return result;
    }

    private int findQuantitySimpleNumbers(Array data) {

        int currentValue;
        int counterSimpleNumbers = 0;

        for (int i = 0; i < data.getLength(); i++) {
            currentValue = data.getArray(i);
            if (isSimpleValue(currentValue)) {
                counterSimpleNumbers++;
            }
        }

        return counterSimpleNumbers;
    }

    private void initializeArrayResult(Array result, Array data) {

        int currentValue;
        int indexArrayResult = 0;

        for (int i = 0; i < data.getLength(); i++) {
            currentValue = data.getArray(i);
            if (isSimpleValue(currentValue)) {
                result.setArray(currentValue, indexArrayResult);
                indexArrayResult++;
            }
        }

    }

    private boolean isSimpleValue(int value) {

        boolean flag = true;

        if (value <= 1) {
            flag = false;
        }

        int counter = 2;

        while ((value > counter) && (flag)) {
            if (value % counter == 0) {
                flag = false;
            }
            counter++;
        }

        return flag;
    }

}