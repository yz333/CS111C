

import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

    private T[] listArray;
    private int numberOfElements;

    public ArrayHeadTailList(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Comparable[capacity];
        listArray = tempList;
        numberOfElements = 0;
    }

    @Override
    public void addFront(T newEntry) {
        add(0, newEntry);
    }

    public void add(int givenPosition, T newEntry) {
        if ((givenPosition >= 0) && (givenPosition <= numberOfElements + 1)) {
            if (givenPosition < numberOfElements)
                makeRoom(givenPosition);
            listArray[givenPosition] = newEntry;
            numberOfElements++;
            ensureCapacity();
        }
        else
            throw new IndexOutOfBoundsException("Given position of add's new entry is out of bounds.");
    }

    private void makeRoom(int givenPosition) {
// Assertion: (newPosition >= 1) && (newPosition <= numberOfEntries + 1)
        int newIndex = givenPosition;
        int lastIndex = numberOfElements;

// Move each entry to next higher index, starting at end of
// list and continuing until the entry at newIndex is moved
        for (int index = lastIndex; index >= newIndex; index--)
            listArray[index + 1] = listArray[index];
    }

    private void ensureCapacity() {
        int capacity = listArray.length-1;
        if (numberOfElements >= capacity) {
            int newCapacity = 2 * listArray.length;
            listArray = Arrays.copyOf(listArray, newCapacity);
        }
    }

    @Override
    public void addBack(T newEntry) {
        add(numberOfElements, newEntry);

    }

    @Override
    public T removeFront() {
        if (!isEmpty()) {
            T result = listArray[0];

            for (int index = 1; index < numberOfElements; index++) {
                listArray[index - 1] = listArray[index];
            }

            numberOfElements--;
            return result;
        } else {
            return null;
        }
    }

    @Override
    public T removeBack() {

        if (!isEmpty()) {
            T item = listArray[numberOfElements - 1];
            listArray[numberOfElements - 1] = null;
            numberOfElements--;
            return item;
        } else {
            return null;
        }

    }

    @Override
    public void clear() {
        for (int index = 0; index <= numberOfElements; index++)
            listArray[index] = null;

        numberOfElements = 0;
    }

    @Override
    public T getEntry(int givenPosition) {
        if (givenPosition < 0) {
            return null;
        } else {
            return listArray[givenPosition];
        }

    }

    @Override
    public void display() {

        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Comparable[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            tempList[i] = listArray[i];

        }
        System.out.print(numberOfElements+ " elements; ");
        System.out.print("capacity = " +listArray.length + "\t");
        System.out.print(Arrays.toString(tempList));
    }

    @Override
    public int indexOf(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (anEntry.equals(listArray[i])) {
                return i;
            }

        }

        return -1;
    }

    @Override
    public int lastIndexOf(T anEntry) {

        for (int i = numberOfElements; i >= 0; i--) {

            if (anEntry.equals(listArray[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T anEntry) {

        for (int i = 0; i < numberOfElements; i++) {

            if (anEntry.equals(listArray[i])) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }
}