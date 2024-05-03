package examples.Scalar;

import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {
    public static void main(String[] args){
        int[] arr =  {11,5,6,3,7,9,2,14};
        int target = 20;
        int[] ans = new int[3];

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            int l = i+1, r = arr.length-1;
            int tar = target-arr[i];
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == tar) {
                    ans[0] = arr[i];
                    ans[1] = arr[l];
                    ans[2] = arr[r];
                    //if we want all the triplets add all the 3 numbers list to a set.
                    break;
                } else if (sum > tar) {
                    r--;
                } else l++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
