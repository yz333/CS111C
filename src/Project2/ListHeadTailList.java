

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListHeadTailList<T> implements HeadTailListInterface<T>{

    List<T> list; // initialize to type ArrayList<T> in the ListHeadTailList constructor
    public ListHeadTailList(int capacity){
        list = new ArrayList<T>(capacity);
    }
    @Override
    public void addFront(T newEntry) {
        list.add(0,newEntry);
    }

    @Override
    public void addBack(T newEntry) {
        list.add(newEntry);
    }

    @Override
    public T removeFront() {
        if(!isEmpty())
            return list.remove(0);
        else
            return null;
    }

    @Override
    public T removeBack() {
        if(!isEmpty())
            return list.remove(list.size()-1);
        else
            return null;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T getEntry(int givenPosition) {
        if (givenPosition<list.size() && givenPosition>=0) {
            return list.get(givenPosition);
        }
        else
            return null;
    }

    @Override
    public void display() {
        System.out.print(list.size()+" elements; ");
        System.out.print(Arrays.toString(list.toArray()));
    }

    @Override
    public int indexOf(T anEntry) {
        if(!isEmpty())
            return list.indexOf(anEntry);
        else
            return -1;
    }

    @Override
    public int lastIndexOf(T anEntry) {
        if(!isEmpty())
            return list.lastIndexOf(anEntry);
        else
            return -1;
    }

    @Override
    public boolean contains(T anEntry) {
        if(isEmpty()){
            return false;
        }
        else
            return list.contains(anEntry);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}