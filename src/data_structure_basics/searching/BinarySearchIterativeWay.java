package data_structure_basics.searching;

import java.util.Arrays;

public class BinarySearchIterativeWay {

    private static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;

            else
                low = mid - 1;

        }
        return -1;

    }


    public static void main(String[] args) {

        int[] arr = {16, 5, 2, 18, 23, 46, 36, 9, 54, 30, 63};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int target = 54;
        System.out.println(Arrays.toString(arr));

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target: " + target + " is at index "+index);
        }else
            System.out.println("Target - "+target+ "- is not available in the array");


    }


}
