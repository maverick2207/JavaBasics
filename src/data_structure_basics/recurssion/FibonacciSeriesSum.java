package data_structure_basics.recurssion;

public class FibonacciSeriesSum {

    static int n = 7;

    public static void main(String[] args) {

        int fab = fibonacci(n);

        System.out.println(fab);
    }

    private static int fibonacci(int n) {

        if(n == 0 || n == 1)
            return n;

        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
