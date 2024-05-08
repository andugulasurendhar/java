package examples.Scalar;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args){
        int[] a = {1,4,5,6,7,8,12,15,20,35};
        int[] b = {2,3,5,7,8,9};

        mergeTwoArrays(a,b);
    }

    public static void mergeTwoArrays(int[] a, int[] b){
        int[] ans = new int[a.length+b.length];
        int i = 0, j=0, k=0;

        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                ans[k] = a[i];
                k++;
                i++;
            } else{
                ans[k] = b[j];
                k++;
                j++;
            }
        }

        while(i<a.length){
            ans[k]=a[i];
            i++;
            k++;
        }

        while(j<b.length){
            ans[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
