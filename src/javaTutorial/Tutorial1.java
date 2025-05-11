package javaTutorial;

public class Tutorial1 {
	
	Tutorial1(){
		System.out.println("test");
	}
	
	static {
		System.out.println("static block before main");
		m();
	}
	
	static int a = 5;
	
	{
		System.out.println("non static block before main");
	}
	
	static void m() {
		System.out.println("method m");
	}

	public static void main(String[] args) {
		Tutorial1 tut = new Tutorial1();
		
		System.out.println(a);
		
//		m();

	}
	static {
		System.out.println("static block after main");
	}

}
