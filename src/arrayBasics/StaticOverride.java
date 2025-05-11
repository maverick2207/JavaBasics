package arrayBasics;

class SuperClass1{
    static void method(){
        System.out.println("superClass method");
    }
}

class SubClass1 extends SuperClass1{
    static void method(){
        System.out.println("SubClass method");
    }
}

public class StaticOverride {

    public static void main(String[] args) {
        SuperClass1 s = new SubClass1();
        SubClass1 s1 = new SubClass1();
        s1.method(); //SubClass method
        s.method(); //superClass method
    }


}
