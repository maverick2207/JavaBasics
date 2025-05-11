package arrayBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author RAHUL
 * 
 * check string contains special characters using regex (regular expression) in java.
 *
 */
public class SpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str = "AbC12@";
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		
		Matcher m = p.matcher(str);
		System.out.println(m);
		
		if(!m.matches()) {
			System.out.println("string '"+str + "' contains special character");
	      } else {
	           System.out.println("string '"+str + "' doesn't contains special character");
	      }

	}

}
