package data_structure_basics.sorting;

import java.util.Random;

public class QuickSortRandomPivot {

    private static final Random random = new Random();

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int pivotIndex = random.nextInt(high - low + 1) + low;

        int piIndex = partition(arr, low, high, pivotIndex);

        quickSort(arr, low, piIndex - 1);
        quickSort(arr, piIndex + 1, high);
    }

    public static int partition(int[] arr, int low, int high, int pivotIndex) {

        swap(arr, pivotIndex, high);
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, j, i);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {

        int[] arr = new int[50];

        int i = 0;
        while(i < arr.length){
            arr[i++] = random.nextInt(100);
        }

        System.out.println("Array before sorting: ");
        printArray(arr);

        quickSort(arr,0,arr.length-1);
        System.out.println("\nArray after sorting: ");
        printArray(arr);


    }


}
