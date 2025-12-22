package arrayBasics;


import static java.lang.System.*;

public class AddFirstAndLastDigit {

    // Static variable to hold the number
    static int a = 2359;

    public static void main(String[] args) {
        // Add first and last digit of a number

        // To get last digit, we can use modulus operator
        // To get first digit, we can divide the number by 10 until it is less than 10

        int lastDigit = a%10;
        out.println("Last digit is : "+lastDigit);

        while(a>10){
            a=a/10;
        }

        out.println("First digit is : "+a);

        // Now we can add first and last digit
        // Note: a is now the first digit after the loop
        // and lastDigit is the last digit we calculated earlier

        out.println("Sum of first and last number is : "+(a+lastDigit));

        // String concatenation examples
        out.println("java"+10); // java10
        out.println(10+"java"); // 10java

        out.println("java"+(10+20)); //java30
        out.println("java"+10+20); // java1020
        out.println(10+20+"java"); //30java
        out.println(10 + "java" + 20); //10java20

    }
}
