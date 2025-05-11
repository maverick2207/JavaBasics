package data_structure_basics.sorting;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortUsingStack {


    public static void quickSort(int[] arr, int low, int high){
        if(arr == null || arr.length <=1)
            return;

        Stack<Integer> stack = new Stack<>();

        stack.push(low);
        stack.push(high);

        while (!stack.isEmpty()){
            high = stack.pop();
            low = stack.pop();

            if(low>=high)
                continue;

            int piIndex = partition(arr, low, high);

            stack.push(low);
            stack.push(piIndex-1);

            stack.push(piIndex+1);
            stack.push(high);

        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low -1;

        for(int j = low; j< high; j++){
            if(arr[j]<= pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);

        return i+1;
    }


    public static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("\nOriginal array 2: " + Arrays.toString(arr2));
        quickSort(arr2,0, arr2.length-1);
        System.out.println("Sorted array 2: " + Arrays.toString(arr2));
    }
}
