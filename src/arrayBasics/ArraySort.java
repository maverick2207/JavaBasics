package arrayBasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * Arrays.sort() vs Collections.sort()
 * -----------------------------------
 *
 * Arrays.sort -> works for arrays which can be of primitive data type.
 * Collections.sort() -> works for objects Collections like ArrayList, LinkedList, etc.
 *
 */

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 7, 6, 45, 21, 9, 105, 102};

        System.out.println("\n 1. sort an array of integers in ascending order");

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        int[] arr4 = new int[]{13, 7, 6, 45, 21, 9, 105, 102};
// A sample Java program to sort a subarray
// using Arrays.sort().

        System.out.println("\n sort a subarray using Arrays.sort()");

        Arrays.sort(arr4, 1, 5);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr4));

//        System.out.println("Binary Search");
//
//        System.out.println(Arrays.binarySearch(arr4, 45));


        // sort in descending order

        System.out.println("\n sort in descending order");

        Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};

        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println("\n"+Arrays.toString(arr1));

        List<String> s = new ArrayList<String>(){{add("CAT");add("DOG");add("Apple");add("LUDO");}};
//        Arrays.sort(s); //will not work with collections
        // use below for collections
        Collections.sort(s);

        String arr2[] = {"BAT", "CAT","Apple"};
        System.out.println("\n sort strings in alphabetical order");
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("\n Sorting string array in reverse order");

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("\n"+Arrays.toString(arr2));
    }
}
