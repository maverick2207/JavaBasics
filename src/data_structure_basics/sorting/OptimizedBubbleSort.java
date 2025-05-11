package data_structure_basics.sorting;


import java.util.Arrays;

/**
 * Optimized bubble sort - if array is already sorted and in first check if not swap happens then it
 * consider the array as sorted and come out of all the loop
 * also in this program swap is happening without using temp variable
 */
public class OptimizedBubbleSort {

    public static int[] optimizedBubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = true;
            count++;
            for (int j = 0; j < arr.length - i - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    count++;
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;

                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                    swap = false;
                }
            }
            if (swap)
                break;
        }
        System.out.println(count);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {78, 59, 42, 36, 32, 26, 14, 9, 7, 4, 1};

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        System.out.println("Sorted Array using bubble sort: " + Arrays.toString(optimizedBubbleSort(arr)));

        /*for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println(" ");*/



        /*int sortedArr[] = optimizedBubbleSort(arr);

        for (int b : sortedArr) {
            System.out.print(b + ", ");
        }*/

    }
}
