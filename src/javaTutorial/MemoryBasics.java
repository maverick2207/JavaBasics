package javaTutorial;

// Class definition
public class MemoryBasics {

	// Instance variables (each object will have its own copy)
	int x = 10;
	int y = 20;

	/**
	 * Method to demonstrate object behavior in memory.
	 * It prints and modifies the current object's x and y values.
	 * @param e Another MemoryBasics object (not used in this version).
	 */
	public void m1(MemoryBasics e) {
		System.out.println("Inside m1(): Passed object original values (e1's x and y)");
		System.out.println(x + " === " + y); // refers to 'this' object's x and y (i.e., e1)

		// Modifying the current object's (this) variables
		x = 5;
		y = 6;

		System.out.println("Inside m1(): Object values after modification (e1)");
		System.out.println(x + " === " + y);
	}

	public static void main(String[] args) {

		// Creating two separate objects of MemoryBasics
		MemoryBasics e1 = new MemoryBasics(); // e1.x = 10, e1.y = 20
		MemoryBasics e2 = new MemoryBasics(); // e2.x = 10, e2.y = 20

		// Print initial values of both objects before calling m1()
		System.out.println("Before calling m1():");
		System.out.println("e1: " + e1.x + " === " + e1.y); // Output: 10 === 20
		System.out.println("e2: " + e2.x + " === " + e2.y); // Output: 10 === 20

		// Call m1() on e1 and pass e2 as an argument (but e2 is not used inside m1())
		e1.m1(e2);

		// After m1(), e1's values are modified but e2's remain unchanged
		System.out.println("After calling m1():");
		System.out.println("e1: " + e1.x + " === " + e1.y); // Output: 5 === 6
		System.out.println("e2: " + e2.x + " === " + e2.y); // Output: 10 === 20
	}
}
