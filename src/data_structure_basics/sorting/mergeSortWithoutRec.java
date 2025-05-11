package data_structure_basics.sorting;

import java.util.Arrays;

public class mergeSortWithoutRec {

    public static void mergeSort(int[] arr) {
        int size = arr.length;
        for (int step = 1; step < size; step = step * 2) {

            for (int left = 0; left < size; left = left + step * 2) {

                int mid = left + step - 1;

                int right = left + 2 * step - 1;

                if(mid >= size -1){
                    mid = size-1;
                    continue;
                }

                if(right >= size-1){
                    right = size -1;

                }

                merge(arr, left, mid, right);
            }
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){

        int size1 = mid-left+1;
        int size2 = right - mid;

        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];


        for(int i = 0 ; i< size1; i++)
            leftArr[i] = arr[left + i];


        for(int j = 0; j <size2; j++)
            rightArr[j] = arr[mid+j+1];

        int i = 0, j = 0, k = left;

        while (i<size1 && j<size2){

            if(leftArr[i]<=rightArr[j])
                arr[k++]=leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while(i<size1)
            arr[k++] = leftArr[i++];

        while (j<size2)
            arr[k++] = rightArr[j++];
    }


    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 12, 96, 1, 23}; // Example array

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr); // Sort the array

        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
