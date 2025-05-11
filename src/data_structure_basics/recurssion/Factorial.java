package data_structure_basics.recurssion;

public class Factorial {

    static int n = 10;

    public static void main(String[] args) {

        int fact = factCalculation(n);

        System.out.println(" Factorial of "+n+" is - "+fact);
    }

    private static int factCalculation(int n) {

        if (n == 0)
            return 1;

        else
            return n*factCalculation(n-1);
    }
}
