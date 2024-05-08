package Sortings;

import java.sql.Array;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] arr = {2343,5366526,57324,246234,343435,2342234,654563,234523,234234,234234};
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            max = Math.max(max,arr[i]);
        }

        int exp = 1;
        while(max>0){
            max /= 10;
            countingSort(arr,  exp);
            exp*=10;
        }

        System.out.println(Arrays.toString(arr));
    }


    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] frequency = new int[10];

        for(int i=0; i<n; i++){
            frequency[(arr[i]/exp)%10]++;
        }


        for(int i=1; i<frequency.length; i++){
            frequency[i] =  frequency[i-1]+frequency[i];
        }

        int[] ans = new int[n];
        for(int i=n-1; i>=0;i--){
            int pos = frequency[(arr[i]/exp)%10];
            frequency[(arr[i]/exp)%10]--;
            ans[pos-1] = arr[i];
        }

        for(int i = 0; i<n;i++){
            arr[i] = ans[i];
        }


    }
}
