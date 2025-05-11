package data_structure_basics.sorting;

import java.util.Arrays;


/**
 * <h1>1. Time Complexities: </h1>
 * <h2>Worst Case Complexity [Big-O]: O(n2)--><h2/>
 * <p>It occurs when the pivot element picked is either the greatest or the smallest element.</p>
 * <p>This condition leads to the case in which the pivot element lies in an extreme end of the sorted array.</p>
 * <p>One sub-array is always empty and another sub-array contains n - 1 elements. Thus, quicksort is called only on this sub-array.</p>
 * <p>However, the quicksort algorithm has better performance for scattered pivots.</p>
 * <br>
 * <h2>Best Case Complexity [Big-omega]: O(n*log n)--></h2>
 * <p>It occurs when the pivot element is always the middle element or near to the middle element.</p>
 * <br>
 * <h2>Average Case Complexity [Big-theta]: O(n*log n)--></h2>
 * <p>It occurs when the above conditions do not occur.</p>
 * <br>
 * <h1>2. Space Complexity: </h1>
 * <p>The space complexity for quicksort is O(log n).</p>
 */

public class QuickSortLastAsPivot {


    public static void quickSort(int[] arr, int low, int high) {

        if (low >= high)
            return;


        int piIndex = partition(arr, low, high);

        quickSort(arr, low, piIndex - 1);

        quickSort(arr, piIndex + 1, high);


    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, j, i);
            }
        }

        int piIndex = i + 1;
        swap(arr, piIndex, high);

        return piIndex;

    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5, 15, 3};
        int n = arr.length;

        System.out.println("Original array:" + Arrays.toString(arr));


        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:" + Arrays.toString(arr));

    }
}
