package arrayBasics;

public class Blocktest {
	// This is a simple Java program to demonstrate the use of static and non-static blocks
	// and how they are executed in relation to the constructor and main method.
	int i ;
	static int j;

	/* Static block */
	// Static blocks are executed when the class is loaded, before any instance of the class is created.
	static {
		System.out.println("static block");
		System.out.println(j);
	}

	/* Non-Static block (Instance block) */
	// Non-static blocks are executed when an instance of the class is created, before the constructor.
	{
		System.out.println("instance/non-static block");
		this.i=10;
		System.out.println(i);
		m(i);
		System.out.println(j);
	}

	/* Constructor */
// The constructor is called when an instance of the class is created.

	Blocktest() {
        System.out.println("MyClass constructor");
 }

 	// This method is a simple demonstration of a non-static method.
	// It prints the value of the parameter passed to it.
	// It can be called after the instance is created.
	void m(int j) {
		System.out.println("this is a method and value of is : "+j);
	}

	// The main method is the entry point of the program.
	// It is where the program starts execution.
	// It is static, so it can be called without creating an instance of the class.
	// It creates an instance of the class and prints the value of the instance variable 'i'.
	public static void main (String [] arg)  {

		System.out.println("Inside main method");
		Blocktest obj = new Blocktest();
		System.out.println(obj.i);
		
	}

}
