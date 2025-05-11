package arrayBasics;

public class FibonacciSeries {

    public static void main(String[] args) {
        int sum = 0;
        int temp = 1;
        int last = 0;
        System.out.println(sum);
        System.out.println(temp);
        for(int i = 0; i<=6;i++){

            sum = last + temp;

            System.out.println(sum);
            last = temp;
            temp = sum;
        }
    }


}
