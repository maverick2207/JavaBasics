package arrayBasics;

interface MyInterface15{
    public static int num = 100;
    public void display();
}

public class InterfaceVariableTest implements MyInterface15{
    public static int num = 10000;
    @Override
    public void display() {
        System.out.println("display method");
    }

    public static void main(String[] args) {

        InterfaceVariableTest obj = new InterfaceVariableTest();

        System.out.println("Value of num of the interface "+MyInterface15.num);
        System.out.println("Value of num of the class "+obj.num);


        // MyInterface1.num = 200; we cannot assign value to final variable
    }
}
