package arrayBasics;

public class ArraySortLogic {
    public static void main(String[] args) {
        // sort an array of integers in ascending order

        // A sample Java program to sort an array
        int[] arr = new int[]{13, 7, 6, 45, 21, 9, 105, 102};

        System.out.println("original arr[] : " + java.util.Arrays.toString(arr));  

        System.out.println("\n 1. sort an array of integers in ascending order");

        // using Arrays.sort() method
        // Arrays.sort() method sorts the specified array into ascending numerical order.
        // The array must be of a type that implements Comparable, such as Integer, Double, etc.
        // If the array is of a primitive type, it will be sorted in ascending order.
        // If the array is of a reference type, it will be sorted according to the natural ordering of its elements.

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print the sorted array
        System.out.println("Sorted arr[] : " + java.util.Arrays.toString(arr));

        // sort an array of integers in descending order

        int[] arr4 = new int[]{13, 7, 6, 45, 21, 9, 105, 102};

        System.out.println("\n 2. sort an array of integers in descending order");
        // A sample Java program to sort a subarray
        // using Arrays.sort().

        System.out.println("\n sort a subarray using Arrays.sort()");

        // Arrays.sort() method sorts the specified range of the array into ascending numerical order.
        // The range to be sorted is specified by the fromIndex (inclusive) and toIndex (exclusive) parameters.
        // The array must be of a type that implements Comparable, such as Integer, Double, etc.
        // If the array is of a primitive type, it will be sorted in ascending order.
        // If the array is of a reference type, it will be sorted according to the natural ordering of its elements.
        // sort a subarray from index 1 to index 5 (exclusive)

        // so it will sort elements from index 1 to index 4

        System.out.println("Original arr[] : " + java.util.Arrays.toString(arr4));

        // sort the subarray from index 1 to index 5
        // (exclusive) in ascending order
        // so it will sort elements from index 1 to index 4
        for (int i = 1; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr4[i] > arr4[j]) {
                    // swap arr4[i] and arr4[j]
                    int temp = arr4[i];
                    arr4[i] = arr4[j];
                    arr4[j] = temp;
                }
            }
        }

        // print the modified array
        System.out.printf("Modified arr[] : %s",
                java.util.Arrays.toString(arr4));

        // sort in descending order
        System.out.println("\n sort in descending order");
        Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    // swap arr1[i] and arr1[j]
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("\n" + java.util.Arrays.toString(arr1));
    }
}
