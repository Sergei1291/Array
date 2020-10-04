package com.epam.array;

import com.epam.array.data.ArrayCreator;
import com.epam.array.data.factory.ArrayCreatorFactory;
import com.epam.array.data.factory.FileArrayCreatorFactory;
import com.epam.array.logic.ArraySimpleNumberCreator;
import com.epam.array.logic.ArraySorter;
import com.epam.array.model.Array;
import com.epam.array.view.FilePrinter;
import com.epam.array.view.Printer;
import com.epam.array.view.ViewException;

public class Main {

    private final static String OUTPUT_DATA = "outputData.txt";
    private final static String OUTPUT_SIMPLE_NUMBERS_ARRAY = "simpleNumbersArray.txt";
    private final static String OUTPUT_SORTED_ARRAY = "sortedArray.txt";

    public static void main(String[] args) throws ViewException {

        //create Array
        ArrayCreatorFactory arrayCreatorFactory = new FileArrayCreatorFactory();
        ArrayCreator arrayCreator = arrayCreatorFactory.createArrayCreator();
        Array data = arrayCreator.create();

        //create Array simple numbers
        ArraySimpleNumberCreator arraySimpleNumberCreator = new ArraySimpleNumberCreator();
        Array simpleNumbersArray = arraySimpleNumberCreator.create(data);

        //sort Array
        ArraySorter sorter = new ArraySorter();
        Array sortedArray = sorter.sort(data);

        //print three Array
        Printer printerData = new FilePrinter(OUTPUT_DATA);
        printerData.print(data);

        Printer printerSimpleNum = new FilePrinter(OUTPUT_SIMPLE_NUMBERS_ARRAY);
        printerSimpleNum.print(simpleNumbersArray);

        Printer printerSortedData = new FilePrinter(OUTPUT_SORTED_ARRAY);
        printerSortedData.print(sortedArray);

    }

}