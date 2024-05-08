package Sortings;

import java.util.Arrays;

public class CountingSort {
  /*1.find the range
    2.create the frequency array
    3.change the frequency array to presum array
    4.Create the ans array
    timecomplexity =  O(n+r)
   */
    public static void main(String[] args){
        int[] arr = {1,7,4,2,1,5,6,7,8,9,3,2,5,2,4,7,9,4,3};

        int[] ans = countingSort(arr);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] countingSort(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] frequency = new int[max+1];

        for(int i=0; i<n; i++){
            frequency[arr[i]]++;
        }


        for(int i=1; i<frequency.length; i++){
           frequency[i] =  frequency[i-1]+frequency[i];
        }

        int[] ans = new int[n];
        for(int i=n-1; i>=0;i--){
            ans[frequency[arr[i]]-1] = arr[i];
            frequency[arr[i]]--;
        }
        return ans;
    }
}
