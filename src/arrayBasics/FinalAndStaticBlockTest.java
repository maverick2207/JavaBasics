package arrayBasics;

class STest {

    public static final int x = 100;

    static {
        System.out.println("This is a static block");
    }

    {
        System.out.println("default block");
    }
}

public class FinalAndStaticBlockTest {

    public static void main(String[] args) {
        System.out.println(STest.x);
//        STest a = new STest();
    }
}
