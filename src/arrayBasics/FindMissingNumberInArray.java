package arrayBasics;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};

        int m = arr.length + 1;

        int total = m * (m + 1) / 2;
        System.out.println(total);

        //sum of the array using stream

        int sum = Arrays.stream(arr).sum();

        // sum using old method
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }

        System.out.println(sum1);

        System.out.println("missing number in the array is - "+(total-sum));


    }
}
