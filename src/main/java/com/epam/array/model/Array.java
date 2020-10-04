package com.epam.array.model;

import java.util.Arrays;

public class Array {

    private int[] array;

    public Array() {

        array = new int[0];
    }

    public Array(int length) {

        array = new int[length];
    }

    public Array(int[] array) {

        this.array = array;
    }

    public int[] getArray() {

        return array.clone();
    }

    public int getArray(int index) {

        return array[index];
    }

    public void setArray(int number, int index) {

        array[index] = number;
    }

    public int getLength() {

        return array.length;
    }

    public void add(int number) {

        int length = getLength();
        int[] newArray = new int[length + 1];

        for (int i = 0; i < length; i++) {
            newArray[i] = this.array[i];
        }

        newArray[length] = number;

        this.array = newArray;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Array other = (Array) obj;
        if (!Arrays.equals(array, other.array))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + " [array=" + Arrays.toString(array) + "]";
    }

}