package arrayBasics;

public class SwapString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		String b = "world";
		
		int c= 10;
		int d = 20;
		
		c = c+d;
		
		d= c-d;
		c= c-d;
		
		System.out.println(c+"======="+d);
		
		
		
		a= a+b;
		
		b = a.substring(0,a.length()-b.length());
		
		System.out.println("value in b: " +b);
		
		a = a.substring(b.length());
		
		System.out.println("value in a: " +a);
	 

	}

}
