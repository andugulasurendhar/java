package com.example.helloworld;
import java.lang.*;
import java.util.*;

public class CombinationSum {
    static List<List<Integer>> ans;
    static int count = 0;
    static void helper(int arr[], int idx, int target, List<Integer> a){
        count++;
        if(target==0){
            ans.add(new ArrayList<>(a));
            return;
        }
        if(idx>=arr.length || target<0) return;

        a.add(arr[idx]);
        helper(arr,idx,target-arr[idx],a);
        a.remove(a.size()-1);
        helper(arr,idx+1,target,a);
    }
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        ans = new ArrayList<>();
        helper(arr,0,target,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args){
        int a = (combinationSum(new int[]{3,4,1,2},9)).size();
        System.out.print(a);
        System.out.println(count);
    }
}
