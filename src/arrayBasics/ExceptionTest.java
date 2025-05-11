package arrayBasics;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            int a = 10/0;
            return;
        }catch (ArithmeticException e ){
            System.out.println(e);
        }

        catch(Exception d){
            System.out.println(d);
        }

        finally{
            System.out.println("this is finally block");
        }
    }
}
/***
 * rules
 * 1. if parent exception declared before child then it will throw compile time error, exception has
 * been caught
 * 2. we cannot duplicate exception. it will throw compile time error, exception has been caught
 *
 * 3. we can write child exception before parent exception
 */