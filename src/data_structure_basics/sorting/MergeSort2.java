package data_structure_basics.sorting;

import java.util.Arrays;

public class MergeSort2 {

    public static void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else
                arr[k++] = rightArr[j++];

        }
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length)
            arr[k++] = rightArr[j++];

    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;

        int leftArr[] = new int[mid];
        int rightArr[] = new int[arr.length - mid];

        for (int i = 0; i < mid; i++)
            leftArr[i] = arr[i];

        for (int j = mid; j < arr.length; j++)
            rightArr[j - mid] = arr[j];


        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 12, 96, 1, 23}; // Example array

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr); // Sort the array

        System.out.println("Sorted Array: " + Arrays.toString(arr));


    }
}
