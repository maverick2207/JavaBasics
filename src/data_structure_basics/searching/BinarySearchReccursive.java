package data_structure_basics.searching;

import java.util.Arrays;


/**
 * <h1>Time Complexities: </h1>
 * <br>
 * <h2>Best case complexity: O(1)</h2>
 * <h2>Average case complexity: O(log n)</h2>
 * <h2>Worst case complexity: O(log n)</h2>
 * <br>
 * <h1>Space Complexity</h1>
 * <br>
 * <h2>The space complexity of the binary search is O(1).</h2>
 */

public class BinarySearchReccursive {


    public static int binarySearch(int[] arr, int low, int high, int target) {


        if (low >= high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] >= target) return binarySearch(arr, low, mid - 1, target);

        else return binarySearch(arr, mid + 1, high, target);

    }

    public static void main(String[] args) {

        int[] arr = {15, 8, 12, 36, 24, 18, 5, 20, 79, 64, 13, 27};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;
        int target = 20;

        int index = binarySearch(arr, low, high, target);

        if (index != -1) System.out.println("Target - " + target + ", is at index - " + index);
        else System.out.println("Target - " + target + ", is not found");

    }
}
