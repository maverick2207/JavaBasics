package data_structure_basics.sorting;

import java.util.Arrays;

public class QuickSortPivotAsMiddle {


    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int piIndex = partition(arr, low, high);

        quickSort(arr, low, piIndex - 1);
        quickSort(arr, piIndex + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {

        int middle = (high + low) / 2;
//        int middle = low + (high - low) / 2;

        int pivot = arr[middle];

        int i = low - 1;

        swap(arr, middle, high);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot ) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 15, 1, 5};
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
