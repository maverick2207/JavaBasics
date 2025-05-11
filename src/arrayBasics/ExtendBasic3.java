package arrayBasics;

class A1 {

    int a = 20;
    static int b = 40;

    void m1() {
        System.out.println("class A1 - method m1");
    }

    void m2() {
        System.out.println("class A1 - method m2");
//        m1();
    }

}

class B1 extends A1 {

    int a = 30;
    static int b = 50;

    void m1() {
        System.out.println("class B1 - method m1");
    }

    void m3() {
        System.out.println("class A1 - method m3");

    }
}

public class ExtendBasic3 {

    public static void main(String[] args) {
        A1 a = new A1();

        System.out.println("ref - a and obj - a");
        a.m1();
        a.m2();
        //a.m3(); compilation error as m3 is not available in A1 class
        // for non static check for object class
        //in case variable call check always from reference class
        //if variable is not available in reference class then it will throw compilation error

        A1 a1 = new B1();
        System.out.println("ref - a and obj - b");
        a1.m1();
        a1.m2();
        System.out.println(a1.a); // will print variable value from class a
        System.out.println(a1.b); // will print variable value from class a
//        a1.m3();
//        compilation error as m3 is not available in A1 class
        // for non static check for object class

        B1 b = new B1();
        System.out.println("ref - b and obj - b");
        b.m1();
        b.m2();
        b.m3();  // if it is not available in object class , then it will look for super class
        System.out.println(b.a); //will print variable value from class b
        System.out.println(b.b);
    }
}
