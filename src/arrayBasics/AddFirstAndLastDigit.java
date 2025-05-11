package arrayBasics;


public class AddFirstAndLastDigit {

    static int a = 23;

    public static void main(String[] args) {

        int temp = a;
        int count = 0;
        int lastDigit = a%10;
        System.out.println(lastDigit);
        while(a>=10){
            a=a/10;
        }

        System.out.println(a);

        System.out.println("Sum of first and last number is : "+(a+lastDigit));
        System.out.println("java"+(10+20)); //java30
        System.out.println("java"+10+20); // java1020
        System.out.println(10+20+"java"); //30java

    }
}
