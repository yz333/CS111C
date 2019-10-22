package Homework7;
import java.util.Arrays;
public class exponent{

public static void recMethod(int[] array, int start, int end) {

        if(start < end){
        System.out.println(Arrays.toString(array));

        array[start]*=2;

        recMethod(array, start+1, end);

        System.out.println(Arrays.toString(array));

        } else {
        System.out.println( "done");
        }}

    public static void main(String[] args) {
        int[] array={3,4,6,7,8,10,4};
        int start=3;
        int end=2;
        recMethod(array,start,end);
    }}
