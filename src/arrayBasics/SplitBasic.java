package arrayBasics;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitBasic {

	public static void main(String[] args) {
		
		
		String value = "12345ACVBabcd&&**";
		Pattern p = Pattern.compile("[0-9]+|[A-Z]+|[a-z]+|[&]+|[*]+");
		Matcher m = p.matcher(value);
		ArrayList<String> all = new ArrayList<>();
		while(m.find()) {
			all.add(m.group());
		}
		
		System.out.println(all);
	}

}
