package arrayBasics;

class ObjectCreation{

    private static ObjectCreation oj = new ObjectCreation();

    private ObjectCreation(){

    }

    public static ObjectCreation getInstance(){
        return oj;
    }

    public void showMessage(){
        System.out.println("Testing Singleton Design pattern");
    }

}

public class SingletonClassTest {

    public static void main(String[] args) {
        ObjectCreation oj = ObjectCreation.getInstance();
        oj.showMessage();

    }
}
