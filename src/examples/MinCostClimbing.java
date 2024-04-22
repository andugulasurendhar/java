package com.example.helloworld;

public class MinCostClimbing {
    public static void main(String[] args) {
        int[] a = new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(a));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int sum = 0;
        int i=0;
        while(i < cost.length-1){
            if(i+2 == cost.length-1){

            }
            if(cost[i] >= cost[i+1])
            {
                sum = sum + cost[i];
                i= i+2;
            } else{
                sum = sum + cost[i];
                i++;
            }
        }
        return sum;
    }
}
