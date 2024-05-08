package examples;

import java.util.Arrays;

public class FindMissingObservations {
    public static void main(String[] args){
        System.out.println(Arrays.toString(missingRolls(new int[]{3,2,4,3},4,2)));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = 0;
        int[] nrolls = new int[n];
        for(int i : rolls){
            sum+=i;
        }
        int nsum = mean*(m+n)-sum;
        if(nsum<=0 ||nsum > n*6 || nsum/n ==0){
            return new int[]{};
        }
        int p=nsum/n,q=nsum%n;
        for(int i=0;i<n;i++)  {
            nrolls[i]=p+(q>0?1:0);
            q--;
        }
        return nrolls;
    }
}
