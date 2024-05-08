package examples.Scalar;

import java.util.Arrays;

public class Sort012 {
    //two pointer approach
    public static void main(String[] args){
        int[] arr = {0,1,0,0,2,2,1,1,2,0,0,0,0,1,1,1,0,2};
        int i = 0, j=0, k = arr.length-1;
        while(i<=k){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if(arr[i] ==2){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
                //i++ we cant increment K because arr[k] might me 0,1 not sure.
            } else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
