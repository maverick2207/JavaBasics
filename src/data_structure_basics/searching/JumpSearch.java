package data_structure_basics.searching;

import java.util.Arrays;

  /**
 * <h1>Time and Space Complexity:<h1/>
 * <br>
 * <h2>Time Complexity:</h2>
 * <h3>Best Case: O(1) </h3>
 * <p>if the target element is at the beginning of the array.</p>
 * <br>
 * <h3>Average Case: O(sqrt(n))</h3>
 * <br>
 * <h3>Worst Case: O(sqrt(n))</h3>
 * <p>occurs when the target element is at the end of the array or not present).</p>
 * <br>
 * <h2>Space Complexity: O(1)</h2>
 * <p>as it is an in-place searching algorithm and does not require any extra space.</p>
 */

public class JumpSearch {

    public static int jumpSearch(int[] arr, int target) {

        int n = arr.length;
        int bSize = (int) Math.sqrt(arr.length);

        int start = 0;
        int last = bSize - 1;

        while (arr[last] < target && start < arr.length) {
            start = last + 1;
            last = last + bSize;

            if (last >= n - 1)
                last = n - 1;
        }

        for (int i = start; i <= last; i++) {
            if (arr[i] == target)
                return i;
        }


        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 9, 13, 6, 23, 12, 19, 10, 15, 1, 27};

        System.out.println("Original Array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));

        int target = 2;

        int index = jumpSearch(arr, target);

        if (index >= 0)
            System.out.println("Index for target: " + target + ", is: " + index);
        else
            System.out.println("Target: " + target + ", is not available in the array!");

    }
}
