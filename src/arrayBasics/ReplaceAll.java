package arrayBasics;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "12345ACVBabcd&&**";
		
		String number = value.replaceAll("[A-Z]+|[a-z]+|[&]+|[*]","");
		String upperCase = value.replaceAll("[0-9]+|[a-z]+|[&]+|[*]","");
		System.out.println(number);
		System.out.println(upperCase);
//		System.out.append(upperCase.toLowerCase());
		String lowerCase = value.replaceAll("[0-9]+|[A-Z]+|[&]+|[*]","");
		String starMarks = value.replaceAll("[0-9]+|[A-Z]+|[a-z]+|[&]","");
		String andCharacter = value.replaceAll("[0-9]+|[A-Z]+|[a-z]+|[*]","");
		
		System.out.println(lowerCase);
		System.out.println(starMarks);
		System.out.println(andCharacter);

		String g = "dsfjlsd1.1jdsal";
		String d = g.replaceAll("[a-z]","");
		System.out.println(d);

		Float f = Float.parseFloat(d);

		f = f+f;

		System.out.println(f);

		String n = String.valueOf(f);



	}

}
