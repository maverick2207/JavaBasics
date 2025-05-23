package data_structure_basics.recurssion;

public class FibonacciSeriesPrint {

    public static void main(String[] args) {

        int n = 20;

        System.out.println("Fibonacci Series upto "+n+" terms is: ");

        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }

    private static int fibonacci(int i) {

        if(i == 0 || i == 1)
            return i;
        else
            return fibonacci(i-1)+fibonacci(i-2);
    }
}
