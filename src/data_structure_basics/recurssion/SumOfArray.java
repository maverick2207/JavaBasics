package data_structure_basics.recurssion;

public class SumOfArray {

    static int[] arr = {15, 16, 33, 45, 56};

    public static void main(String[] args) {

        int sum = sumOfDigit(arr.length - 1);

        System.out.println("Sum of digit is - " + sum);
    }

    private static int sumOfDigit(int i) {
        if (i == 0)
            return arr[i];
        else
            return arr[i] + sumOfDigit(i - 1);
    }


}
