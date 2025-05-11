package arrayBasics;

import java.util.Arrays;

public class FindAllMissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 4, 10, 9, 8, 2};
        int l = arr.length;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int [] arr2 = new int[arr[l-1]+1];

        for(int i = 0;i<l;i++){

            arr2[arr[i]]=1;
        }

        System.out.println(Arrays.toString(arr2));

        for(int j = 1;j<arr2.length;j++){

            if(arr2[j]==0){
                System.out.println(j);
            }
        }


    }
}

