package arrayBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TESTCTS {


    public static void main(String[] args) {
//        int arr [] = {2,5,8,6,9};

        //op - 3,6,9,7,10

//        int len = arr.length;
//        int l = 0;
//
//        for(int i = 0;i<len;i++){
//
//            l = arr[i]+1;
//            arr[i]= l;
//
//        }
//
//        System.out.println(Arrays.toString(arr));

//    }


//        int a [] = {8,9,4,5,1,2,0,6};
//
//
//        int len = a.length;
//
//        Set<Integer> s = new HashSet<>();
//
//        for(int i = 0; i<len;i++){
//
//            for(int j = i+1;j<len;j++){
//
//                if(a[i]+a[j]==6){
//
//                    s.add(a[i]);
//                    s.add(a[j]);
//                }
//            }
//        }
//
//        System.out.println(s);
//        //4,2,5,1,0,6
//
//        String c=  "name";
//        String b = new String("name");
//        System.out.println(c.equals(b)); // true
//        System.out.println(c == b); //false
//
//        try { int[] d = new int[5]; a[5] = 30 / 0; }
//
//        catch (ArithmeticException e) { System.out.println("Outer catch block 1"); }
//        catch (ArrayIndexOutOfBoundsException e)
//        { System.out.println("Outer catch block 2"); }
//        catch (Exception e)
//        {System.out.println("Inner try catch"); }

        System.out.println('j'+'a'+'v'+'a');

        String a = "my name is cogniznat";
        int n = 5;

        //ta nzin go

        StringBuffer b = new StringBuffer(a);
        String s = String.valueOf(b.reverse());

        System.out.println(s);

        String p []= s.split(" ");
        String r = p[0]+p[1];

        char [] c = r.toCharArray();
        String rev = "";

        for(int i = 0; i<c.length;i++){
            rev = rev + c[i];
            if(i%n==0){

                rev= rev+" ";

            }


        }
        System.out.println(rev);


    }

}
