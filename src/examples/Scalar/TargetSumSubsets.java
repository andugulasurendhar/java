package examples.Scalar;

import java.util.ArrayList;

public class TargetSumSubsets {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50, 60};
        int target = 60;
        ArrayList<Integer> ans= new ArrayList<>();
        tss(arr, 0, target,ans);
    }

    static void tss(int[] arr, int i, int target, ArrayList<Integer> ans){

        if(i == arr.length){
            if(target==0) {
                System.out.println(ans);
            }
            return;
        }
        //consider the element
        ans.add(arr[i]);
        tss(arr, i+1, target-arr[i], ans);
        ans.remove(ans.size()-1);
        //dont consider the element
        tss(arr, i+1, target, ans);
    }
}
