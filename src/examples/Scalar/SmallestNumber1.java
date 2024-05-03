package examples.Scalar;

import java.util.Arrays;

public class SmallestNumber1 {
    //N = 1000 then ans= 5558 {5*5*5*8}
    public static void main(String[] args){
        int[] factors = new int[10];
        int i=9;
        int N = 1000;
        StringBuilder as = new StringBuilder();
        while(i>1){
            if(N%i == 0){
                ++factors[i];
                N = N/i;
                as.insert(0,i);
            } else{
                i--;
            }
        }

        System.out.println(Arrays.toString(factors));
        System.out.println(as);
    }
}
