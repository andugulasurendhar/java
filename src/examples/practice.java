package examples;

import java.util.*;
import java.lang.*;

public class practice {
    public static void main(String[] args) {

                String str = "Geekssss";
                String[] arrOfStr = str.split("s");

                for (String a : arrOfStr)
                    System.out.println(a);
    }



    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }

}
