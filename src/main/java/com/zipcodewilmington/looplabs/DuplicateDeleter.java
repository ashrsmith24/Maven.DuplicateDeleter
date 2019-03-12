package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);

    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    public int compareValues(int index) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index].equals(array[i])) {
                count++;
            }

        }
        return count;
    }
}

