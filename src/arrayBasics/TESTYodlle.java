package arrayBasics;

public class TESTYodlle {



    public static void main(String[] args) {


        int [] arr = {0,0,1,0,0,0,1,1,1,0};

        int start = 0;
        int end = arr.length-1;

        while(start<end){

            if(arr[start]==1){
                start++;
            }
            if(arr[end]==0){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
