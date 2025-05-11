package arrayBasics;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char in = s.next().charAt(0);
        System.out.println(in);
        String a = "abbbbdfaljldfjlsdj";

        char [] c = a.toCharArray();

        int count = 0;

        for(int i = 0; i<c.length;i++){

            if(in==c[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
