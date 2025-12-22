package arrayBasics;


public class TESTMS {

    public static int add(int[] arr) {
        int temp = 1,sum, value = 0;
        for (int i = 1; i < 10; i++) {
            sum = i;
            System.out.println("value of i : "+i);
            for (int j = 0; j < arr.length; j++) {

                sum = sum + arr[j];
                System.out.println("value of sum : "+sum);
                if (sum < 1) {
                    break;
                }
            }
            System.out.println("======");
            if (sum>=i) {

                break;

            }
            temp = i;

        }
        return temp;
    }

        public static void main(String [] args){

            int arr1[] = {4, -7, 5, -2, 1};
            System.out.println(add(arr1));
        }

}
