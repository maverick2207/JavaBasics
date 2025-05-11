package arrayBasics;

public class ExtendsBasicQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int x= 10;
//		int y = 10;
//		
//		if(x==y) {
//			System.out.println("hence proved");
//		}
		// Up casting
		A a = new A();
		a.show();// Show method from class A
		a.show1();//Show1 method from class A
		B b = new B();
		b.show();   // Show method from class B
		b.show2();  //Show2 method from class B
		A a2 = new C();
		a2.show();  // Show method from class c
		a2.show1(); // show method from class a , as it is not available in class c
//	     a2.show3(); //Compile time Error
		A a3 = new B();
		a3.show(); // Show method from class B
		a3.show1();// Show1 method from class A
//		a3.show2(); //compile time error

//	     A a4 = new A();
		// Down Casting
		B b1 = (B) a3;
		b1.show(); // Show method from class B
		b1.show2(); // Show2 method from class B
		b1.show1(); // show1 method from class A
		
//		B b2 = (B)new A();
	}

}

class A {
	
	public static int z = 10;
	public int y = 10;
	public void show() {
		System.out.println("Show method from class A");
		z++;
		System.out.println(z);
//		show1();
		test();
	}

	public void show1() {
		System.out.println("Show1 method from class A");
	}
	
	public static void test() {
		System.out.println("test");
		
	}
}

class B extends A {
	public void show() {
		System.out.println("Show method from class B");
	}

	public void show2() {
		System.out.println("Show2 method from class B");
	}
}

class C extends B {
	public void show() {
		System.out.println("Show method from class c");
	}

	public void show3() {
		System.out.println("Show3 method from class c");
	}

}
