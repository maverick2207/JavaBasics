package arrayBasics;

import java.util.HashMap;

public class ArraySubsetUsingMap {

	public static int isSubset(int[] arr1, int[] arr2, int m, int n) {

		HashMap<Integer, Integer> mp1 = new HashMap<Integer, Integer>();
		if (n > m) {
			return 1; // arr2 cannot be a subset of arr1 if it is larger
		}

		// Store the elements of arr1 in a HashMap
		// with their counts
		// This allows for O(1) average time complexity for lookups
		// and deletions
		// This is more efficient than using nested loops
		// which would have O(m * n) time complexity
		// This approach has O(m + n) time complexity
		// and O(m) space complexity
		// where m is the size of arr1 and n is the size of arr2
		// This is because we are storing the elements of arr1 in a HashMap
		// and then checking if the elements of arr2 are present in the HashMap
		// and removing them if they are present
		// If an element is not present in the HashMap, it means that arr2
		// is not a subset of arr1

		// If an element is present in the HashMap, we decrement its count
		// If the count becomes zero, we remove the element from the HashMap
		// This ensures that we only keep track of the elements that are still
		// present in arr1 and their counts
		// This is a more efficient way to check if arr2 is a subset of arr1
		// as we do not need to iterate through arr1 again and again
		// for each element of arr2


		for (int i = 0; i < m; i++) {

			if (mp1.containsKey(arr1[i])) {

				mp1.put(arr1[i], mp1.get(arr1[i]) + 1);
			} else {
				mp1.put(arr1[i], 1);
			}
		}
		int f = 0;
		for (int i = 0; i < n; i++) {

			if (!mp1.containsKey(arr2[i])) {
				f = 1;
				break;
			}

			else {

				mp1.put(arr2[i], mp1.get(arr2[i]) - 1);
				if (mp1.get(arr2[i]) == 0) {
					mp1.remove(arr2[i]);
				}
			}

		}
		return f;

	}

	public static void main(String[] args) {

		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n) != 1)
			System.out.print("arr2[] is subset of arr1[] ");
		else
			System.out.print("arr2[] is not a subset of arr1[]");

	}

}
