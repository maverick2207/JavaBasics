package arrayBasics;

import java.util.ArrayList;
import java.util.List;

public class testgl {


    public static void main(String[] args) {
//        String s = "rahul12323@#$456singhAC";
//        List<String> l = new ArrayList<>();
//
//        String spc = s.replaceAll("[a-z]+|[0-9]","");
//        String number = s.replaceAll("[a-zA-Z]+|[@#$]","");
//        String letter = s.replaceAll("[0-9]+|[@#$]","");
//        l.add(spc);
//        l.add(number);
//        l.add(letter);
//        System.out.println(l);

        int [] arr = {1,2,3,4,5};
        // op - 1,2,6,24,120

        int mul = 1;
        int next;
        int arr2[] = new int[arr.length];
        arr2[0] = arr[0];
        for(int i = 0; i<arr.length;i++){
            mul = mul*arr2[i];
            next = arr[i+1];
            mul = next;
            arr2[i]= mul;
            System.out.println(mul);
//            for(int j = 0; j<=i;j++){
//
//                mul = arr[j]*mul;
//
//            }
//            arr2[i]=mul;
//            System.out.println(arr2.toString());

        }




    }
}
