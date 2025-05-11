package arrayBasics;

public class ReverseWithoutAffectingDigit {

    public static void reverse (char[] a){

        int r = a.length-1;
        int l = 0;

        // !Character.isDigit(a[l]) will reverse the digit and keep character in same order
        while(l<r){
            if(Character.isDigit(a[l])){
                l++;
            }else if (Character.isDigit(a[r])){
                r--;
            }else{
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

    }

    public static void main(String[] args) {

        String str = "a111b2c2d3e4f5ghi";

        char [] charArray = str.toCharArray();

        System.out.println("Input string: " + str);

        reverse(charArray);

        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
    }
}
