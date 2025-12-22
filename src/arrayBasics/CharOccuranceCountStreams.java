package arrayBasics;

public class CharOccuranceCountStreams {


    public static void main(String[] args) {

        // Example of counting occurrences of a character in a string using streams
        String s = "testttttting";

        String j = String.valueOf(100);

        System.out.println("String j: " + j); // Output: String j: 100

        long t = s.chars().filter(x -> (char)x == 't').count();

        long c = s.chars().filter(x->x=='t').count();

        System.out.println("Count of 't' in '" + s + "': " + c); // Output: Count of 't' in 'testttttting': 7


        System.out.println("Count of 't' in '" + s + "': " + t); // Output: Count of 't' in 'testttttting': 7

        // Example of comparing char and int

        int a = 5;
        char b = '5';

        if(b==a){
            System.out.println("true");
        }
        else{
            System.out.println("false"); //output : false
        }

    }
}
