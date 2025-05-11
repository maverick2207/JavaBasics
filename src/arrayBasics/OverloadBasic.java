package arrayBasics;

public class OverloadBasic {

    public void m (Object o){
        System.out.println("this is a method with object o");
    }

    public void m (String s){
        System.out.println("this is a method with String s");
    }

    public static void main(String[] args) {
        OverloadBasic a = new OverloadBasic();
        a.m(null);
    }
}
