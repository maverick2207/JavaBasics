package arrayBasics;

public class Blocktest {
	
	int i ;
	static int j;

	static {
		System.out.println("static block");
		System.out.println(j);
	}

	/* Non-Static block (Instance block) */
	{
		System.out.println("instance/non-static block");
		this.i=10;
		System.out.println(i);
		m(i);
	}

	/* Constructor */
	Blocktest() {
        System.out.println("MyClass constructor");
 }
	
	void m(int j) {
		System.out.println("this is a method and value of is : "+j);
	}
	
	public static void main (String [] arg)  {
		
		
		
		System.out.println("Inside main method");
		Blocktest obj = new Blocktest();
		System.out.println(obj.i);
		
	}

}
