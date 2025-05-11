package arrayBasics;

//interface MyInterface {
//    int i=2;
//    void m1();
//    void m2();
//}
// 
//

//public class MyClass implements MyInterface{ 
//    public static void main(String[] args) {
//           MyInterface obj=new MyClass();
//          //    	MyClass obj = new MyClass();
//           obj.m1();
//           obj.m2();
//           System.out.println("MyInterface's i = "+i);
//    }
//    
//    @Override
//    public void m1(){
//           System.out.println("in m1()");
//    }
//
//    @Override
//    public void m2(){
//           System.out.println("in m2()");
//    }
//}


interface MyInterface {
    void m1();
    void m2();
}
 
/*
 * abstract class
 */
abstract class MyAbstractClass implements MyInterface {
    @Override
    public void m1(){ 
           System.out.println("in m1()");
    }
}
 
/*
 * concrete class
 */
//class MyClass extends MyAbstractClass {
//    @Override
//    public void m2(){
//           System.out.println("in m2()");
//    }
//}