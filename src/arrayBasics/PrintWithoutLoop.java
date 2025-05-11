package arrayBasics;

import java.util.stream.IntStream;

public class PrintWithoutLoop {


    public static void printWithoutLoop(int n){
        if(n<=10){
            System.out.println(n);
            printWithoutLoop(n+1);
        }
    }
   //without using number
    static int a = 'a'/'a';
    static String b= "..........";

    public static void main(String[] args) {

        //printing using stream
        System.out.println("printing using stream");

        IntStream.range(1,100).forEach(x-> System.out.println(x));

        printWithoutLoop(1);

        for(int i = a;i<=b.length();i++){
            System.out.println(i);
        }
    }
}
