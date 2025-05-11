package data_structure_basics.recurssion;

public class TestRecurssion {

    public static void main(String[] args) {
        testRecursion(5);
    }

    private static void testRecursion(int i) {

        if (i >= 0 && i<6){
            testRecursion(i-1);

            System.out.print(i + " ");
        }



    }
}
