package Homework7;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void reverseArray(int[] array) {
        int first = 0;
        int second = array.length - 1;
        recursiveMethod(array, first, second);
    }
    private static void recursiveMethod(int [] a, int first, int second){
        if(first<second){
            int temp = a[first];
            a[first]=a[second];
            a[second]=temp;
            recursiveMethod(a,first+1,second-1);

        }
    }

    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        reverseArray(x);
        System.out.println(Arrays.toString(x));
    }

}
