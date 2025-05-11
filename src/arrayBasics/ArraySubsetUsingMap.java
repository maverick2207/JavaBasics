package arrayBasics;

import java.util.HashMap;

public class ArraySubsetUsingMap {

	public static int isSubset(int[] arr1, int[] arr2, int m, int n) {

		HashMap<Integer, Integer> mp1 = new HashMap<Integer, Integer>();

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
		// TODO Auto-generated method stub

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
