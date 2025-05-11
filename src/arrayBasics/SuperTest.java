package arrayBasics;


class SuperClass{
    
     //instance method
    void method(){
           System.out.println("superClass method");
    }
}
 
class SubClass extends SuperClass{
    //instance method
    @Override
    void method(){
           System.out.println("SubClass method");
           super.method();    //will call method() of SuperClass.
    }
}
 

public class SuperTest {
    public static void main(String[] args) throws Exception {
           SuperClass obj=new SubClass();
           obj.method();  //will call overridden method() of SubClass 
    }
}