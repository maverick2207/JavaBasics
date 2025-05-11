package arrayBasics;

public class BaicProgram2 {

    public static void main(String[] args) {
        double e = 10.0 / -0;
        if(e == Double.POSITIVE_INFINITY)
            System.out.println("Positive infinity"); // op
        else
            System.out.println("Negative infinity");
    }
}
