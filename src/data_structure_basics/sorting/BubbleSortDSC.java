package data_structure_basics.sorting;

import java.util.Arrays;

public class BubbleSortDSC {


    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {14, 9, 26, 4, 36, 78, 1, 42, 59, 32, 7};

        System.out.println("Unsorted Array: ");

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println(" ");

        bubbleSort(arr);

        System.out.println("Sorted Array using bubble sort: "+ Arrays.toString(arr));



    }
}
