package data_structure_basics.sorting;


/**
 * <h1>Time Complexities:</h1>
 *
 * <p>Number of comparisons: (n - 1) + (n - 2) + (n - 3) + ..... + 1 = n(n - 1) / 2 nearly equals to n2.
 * Complexity = O(n^2)
 * <br>
 * Also, we can analyze the complexity by simply observing the number of loops. There are 2 loops so the complexity is n*n = n2.
 * </p>
 * <br>
 * <h2>Worst Case Complexity: O(n^2)</h2>
 * <p>If we want to sort in ascending order and the array is in descending order then, the worst case occurs.</p>
 * <h2>Best Case Complexity: O(n^2)</h2>
 * <p>It occurs when the array is already sorted</p>
 * <h2>Average Case Complexity: O(n^2)</h2>
 * <p>
 * It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
 * </p>
 *
 * <h1>Space Complexity:</h1>
 * <p>Space complexity is O(1) because an extra variable min_idx is used.</p>
 */

public class SelectionSort {


    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;

                }

                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int arr[] = {78, 59, 42, 36, 32, 26, 14, 9, 7, 4, 1};

        int[] arr = {15, 2, 45, 56, 23, 4, 18, 1, 36, 9, 13, 12};

        System.out.println("Unsorted Array: ");

        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println(" ");

        System.out.println("Sorted Array using bubble sort: ");

        int[] sortedArr = selectionSort(arr);

        for (int b : sortedArr) {
            System.out.print(b + ", ");
        }

    }
}
