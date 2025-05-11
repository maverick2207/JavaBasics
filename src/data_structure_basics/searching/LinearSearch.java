package data_structure_basics.searching;

import java.util.Arrays;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LinearSearch {

    public static int linearSearch(int[] arr, int search){

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == search)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {12,5,6,7,1,13,15,3};

        int search = 19;

        int index = linearSearch(arr, search);

        if(index != -1)
            System.out.println("Index of - "+ search+", in "+ Arrays.toString(arr)+" is: "+index);
        else
            System.out.println("Value not found!");

    }
}
