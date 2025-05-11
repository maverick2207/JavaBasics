package arrayBasics;

public class CharOccuranceCountStreams {


    public static void main(String[] args) {

        String s = "testing";
        String j = String.valueOf(100);

        long t = s.chars().filter(x -> (char)x == 't').count();

        System.out.println(t);

        int a = 5;
        char b = '5';

        if(b==a){
            System.out.println("true");

        }

    }
}
