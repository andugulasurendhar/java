package examples.Scalar;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr =  {11,5,6,3,7,9,2,14};
        int target = 15;
        int[] ans = new int[2];


//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i = 0;i<arr.length;i++){
//            if(hm.containsKey(target-arr[i])){
//                ans[0] = hm.get(target-arr[i]);
//                ans[1] = i;
//                break;
//            } else hm.put(arr[i], i);
//        }
//
//        System.out.println(Arrays.toString(ans));

        //decrease the space complexity
        Arrays.sort(arr);
        int l = 0, r = arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum == target){
                ans[0] = arr[l];
                ans[1] = arr[r];
                break;
            } else if(sum > target){
                r--;
            }  else l++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
