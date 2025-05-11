package javaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArraySortMethod {
	
	public static boolean sortMethod(int arr1[], int arr2[]) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int m = arr1.length;
		int n = arr2.length;
		
		int i = 0;
		int j = 0;
		
		while(i<m && j<n) {
			if(arr1[j]<arr2[i])
				j++;
			
			else if(arr1[j]==arr2[i]) {
				i++;
				j++;
			}
			
			else if(arr1[j]>arr2[i])
				return false;
		}
		
		if(i<n)
			return false;
		else
			return true;
	}
	
	public static boolean hashCheck(int arr1[], int arr2[]) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		for(int i = 0;i<arr1.length;i++) {
			
			h1.add(arr1[i]);
		}
		
		for(int j = 0;j<arr2.length;j++) {
			
			if(!h1.add(arr2[j])) {
				return false;
			}
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {11, 1, 13, 21, 3, 7}; 
	    int arr2[] = {11, 3, 7, 1}; 
	    
	    if(sortMethod(arr1, arr2))
	    	System.out.println("arr2 is a subset of arr1");
	    else
	    	System.out.println("arr2 is not a subset of arr1");
	    
	    if(hashCheck(arr1, arr2))
	    	System.out.println("arr2 is a subset of arr1");
	    else
	    	System.out.println("arr2 is not a subset of arr1");
	}
	

}
