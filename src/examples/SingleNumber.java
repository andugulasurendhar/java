package com.example.helloworld;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,4,3,1,5,4};
     System.out.println( singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        int a = 0;
        for(int i=0 ; i< nums.length; i++){
            a ^= nums[i];
        }

        return a;
    }
}
