package arrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

public class FindFirstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Test";
		s1= s1+" is Completed";

		System.out.println(10+20+"abc");
		System.out.println("abc"+10+20);
		
		System.out.println(s1);
		
		String str = "abcdDBCA1234";
		String new1 = str.replaceAll("[A-Z]","");
		System.out.println(new1);

		String text = "bcabazjjkmnboopa";

		char[] ch;

		ch = text.toCharArray();

		HashSet<Character> hs = new HashSet<>();

		for (int i = 0; i < ch.length; i++) {

			if (!hs.add(ch[i])) { // or use hs.contains(ch[i])
				System.out.println("First repeating character in the word is : "+ch[i]);
				break;
			} else {
				hs.add(ch[i]);
			}

		}

	}
}
