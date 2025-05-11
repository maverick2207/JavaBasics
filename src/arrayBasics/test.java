package arrayBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class test {
    public static void main(String[] args) {

//        String a = "test";
//
//        char[] b = a.toCharArray();
//
//        int size = b.length;
//
//
//       StringBuffer a3= new StringBuffer("a");
//       String a4 ="a";
//
//        StringBuffer a5= new StringBuffer("a");
//
//        Map<String, Integer> kk = new HashMap<>();
//
//        kk.put("aakash", 10);
//        System.out.println(kk.get("aakash")/5);

        ArrayList<Integer> ay = new ArrayList<>(){{add(1);add(20);add(30);add(7);add(50);add(15);}};

        //7,50,15,30, 1, 20

        for(int i = 0;i<ay.size();i++){

            if(i==3){

                for(int j = i;j<ay.size();j++){

                    System.out.print(ay.get(j)+",");

                }

            }

        }

        System.out.print(ay.get(2)+",");
        for(int k = 0;k<2;k++){
            System.out.print(ay.get(k)+",");
        }
//        System.out.println(a3.equals(a5));
//
//        for(int i = 0;i<size;i++){
//            int count=0;
//            for(int j = 0;j<=i;j++){
//
//
//
//                System.out.print(b[count]);
//                count++;
//            }
//            System.out.println("");
//        }

    }
}
