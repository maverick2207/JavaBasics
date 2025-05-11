package arrayBasics;

public class NumberPalindrome {

    static int a = 1234321;

    public static void main(String[] args) {
        int temp = a;
        int sum = 0;
        int r = 0;

        // way 1
        while(a>0){
            r = a%10;
            sum = (sum*10)+r;
            a=a/10;
        }
        System.out.println("number after reversing " + sum);
        if(sum == temp){
            System.out.println(temp+" is a palindrome");
        }
        else {
            System.out.println(temp+" is not a palindrome");
        }

        // way 2

        String n = String.valueOf(temp);

        StringBuffer sb = new StringBuffer(n);
        String rn = sb.reverse().toString();

        System.out.println("After Reversing "+rn);
        if(n.equalsIgnoreCase(rn)){
            System.out.println(rn+" is a palindrome");

        }

    }


}
