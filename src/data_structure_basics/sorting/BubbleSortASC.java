package data_structure_basics.sorting;

/**
 * Refer for time complexity: https://www.programiz.com/dsa/bubble-sort
 * *******
 * Worst Case Complexity: O(n^2) -->
 * If we want to sort in ascending order
 * and the array is in descending order then the worst case occurs.
 * *******
 * Best Case Complexity: O(n) -->
 * If the array is already sorted, then there is no need for sorting.
 * *******
 * Average Case Complexity: O(n2)
 * It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
 * *******
 * Space Complexity is O(1) because an extra variable is used for swapping.
 * In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).
 */

public class BubbleSortASC {

    public static int[] bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
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

        System.out.println("Sorted Array using bubble sort: ");

        int sortedArr[] = bubbleSort(arr);

        for (int b : sortedArr) {
            System.out.print(b + " ");
        }

    }
}
