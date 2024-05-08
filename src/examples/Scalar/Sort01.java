package examples.Scalar;

import java.util.Arrays;

public class Sort01 {
    //two pointer approach
    public static void main(String[] args){
        int[] arr = {0,1,0,0,1,1,1,0,0,0,0,1};
        int i = 0, j=0;
        while(i< arr.length){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
