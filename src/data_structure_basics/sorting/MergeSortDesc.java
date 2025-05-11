package data_structure_basics.sorting;

import java.util.Arrays;

public class MergeSortDesc {

    private static void merge(int[] arr, int left, int mid, int right) {

        int size1 = mid - left + 1;
        int size2 = right - mid;

        int[] arrLeft = new int[size1];
        int[] arrRight = new int[size2];

        for (int i = 0; i < size1; i++)
            arrLeft[i] = arr[left + i];

        for (int j = 0; j < size2; j++)
            arrRight[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (arrLeft[i] >= arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            arr[k] = arrLeft[i];
            i++;
            k++;
        }
        while(j<size2){
            arr[k] = arrRight[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }


    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 12, 96, 1, 23}; // Example array

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1); // Sort the array

        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
