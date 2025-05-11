package javaTutorial;

public class MemoryBasics {

	int x = 10;
	int y = 20;

	public void m1(MemoryBasics e) {
		System.out.println("Passed object original values");
		System.out.println(x + "====" + y);
		
		x=5;
		y=6;
		
		
		System.out.println("Object value after modification");
		System.out.println(x + "====" + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryBasics e1 = new MemoryBasics();
		MemoryBasics e2 = new MemoryBasics();
		
		System.out.println("Object value before calling m1()");
		System.out.println(e1.x + "====" + e1.y);
		System.out.println(e2.x + "====" + e2.y);
		
		e1.m1(e2);
		
		System.out.println("Object value after calling m1()");
		System.out.println(e1.x + "====" + e1.y);
		System.out.println(e2.x + "====" + e2.y);
	}

}
