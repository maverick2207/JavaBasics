package data_structure_basics.sorting;

import java.util.Arrays;

/**
 * <h1>Time Complexity: </h1>
 * <br>
 * <h2>> Best Case Complexity: O(n*log n)</h2>
 * <br>
 * <h2>> Worst Case Complexity: O(n*log n)</h2>
 * <br>
 * <h2>> Average Case Complexity: O(n*log n)</h2>
 * <br>
 * <h1>Space Complexity: </h1>
 * <h2>> The space complexity of merge sort is O(n).</h2>
 */


public class MergeSortASC {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            // finding mid of the array
            int mid = (left + right) / 2;

            // dividing further left side array
            mergeSort(arr, left, mid);

            // dividing further right side array
            mergeSort(arr, mid + 1, right);

            // merging the array
            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {

        // setting size of left side temporary array
        int size1 = mid - left + 1;

        // setting size of right side temporary array
        int size2 = right - mid;

        // creating left and right temporary array
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        // adding values in the array
        for (int i = 0; i < size1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < size2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // merging temporary array back to main array

        int i = 0;
        int j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copying remaining elements leftArr
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // copying remaining elements rightArr
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }


    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3}; // Example array , 9, 82, 12, 96, 1, 23

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1); // Sort the array

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
