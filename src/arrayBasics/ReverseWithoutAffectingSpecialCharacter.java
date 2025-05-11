package arrayBasics;

public class ReverseWithoutAffectingSpecialCharacter {

    public static void reverse  (char [] a){

        int r = a.length-1;
        int l = 0;

        while(l<r){

            if(!Character.isAlphabetic(a[l])){
                l++;
            }
            else if(!Character.isAlphabetic(a[r])){
                r--;
            }else{

                char temp = a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }

        }

    }

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";

        char [] charArray = str.toCharArray();

        System.out.println("Input string: " + str);

        reverse(charArray);

        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
    }


}
