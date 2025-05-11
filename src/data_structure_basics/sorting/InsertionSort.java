package data_structure_basics.sorting;

/**
 * <h1>Time Complexities</h1>
 *
 * <h2>Worst Case Complexity: O(n2)</h2>
 * <p>Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case complexity occurs.</p>
 * <br>
 * <p>Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.</p>
 * <br>
 * <p>Thus, the total number of comparisons = n*(n-1) ~ n2</p>
 * <br>
 * <h2>Best Case Complexity: O(n)</h2>
 * <p>When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all.
 * <br>So, there are only n number of comparisons. Thus, complexity is linear.</p>
 * <br>
 * <h2>Average Case Complexity: O(n2)</h2>
 * <p>It occurs when the elements of an array are in jumbled order (neither ascending nor descending).</p>
 * <br>
 * <h1>Space Complexity</h1>
 * <p>Space complexity is O(1) because an extra variable key is used.</p>
 */

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > key) {

                    arr[j + 1] = arr[j];
                    arr[j] = key;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {14, 9, 26, 4, 36, 78, 1, 42, 59, 32, 7};

        System.out.println("Unsorted Array: ");

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println(" ");

        System.out.println("Sorted Array using insertion sort: ");

        int sortedArr[] = insertionSort(arr);

        for (int b : sortedArr) {
            System.out.print(b + " ");
        }

    }
}
