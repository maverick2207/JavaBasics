package arrayBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(1);
		arr.add(20);
		arr.add(6);
		arr.add(15);
		arr.add(20);
		arr.add(1);
		arr.add(10);
		arr.add(12);
		arr.add(15);
		arr.add(7);
		arr.add(9);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		//keep duplicates
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (Integer i : arr) {
			if(!set.add(i)) {
				newList.add(i);
			}
		}
	
		//remove duplicates
//		HashSet<Integer> set = new HashSet<Integer>()
//		for(Integer i : arr) {
//			
//			if(!newList.contains(i)) {
//				newList.add(i);
//				
//			}
//		}
		
		System.out.println(newList);
		
//		remove duplicates
//		HashSet<Integer> set = new HashSet<Integer>(arr);

//		Iterator<Integer> ir = set.iterator();
//		while(ir.hasNext()) {
//		System.out.println(ir.next());
//		}

	}

}
