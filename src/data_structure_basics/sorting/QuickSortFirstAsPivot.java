package data_structure_basics.sorting;

import java.util.Arrays;

public class QuickSortFirstAsPivot {

    public static void quickSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int piIndex = partition(arr, low, high);

        quickSort(arr,low,piIndex-1);
        quickSort(arr,piIndex+1,high);


    }

    public static int partition(int[] arr, int low, int high) {
        int pivotIndex = low;

        int pivot = arr[pivotIndex];

        int i = low +1;

        for(int j = low +1; j<= high; j++ ){
            if(arr[j]<=pivot)
            {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i - 1, pivotIndex);

        return i - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 15, 1, 5};
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
