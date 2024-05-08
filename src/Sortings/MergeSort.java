package Sortings;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args)
    {
        int[] arr = { 9, 3, 1, 5};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi){
            int[] ans = new int[1];
            ans[0] = arr[lo];
            return ans;
        }

        int mid = lo+(hi-lo)/2;
        int[] arr1 = mergeSort(arr, lo, mid);
        int[] arr2 = mergeSort(arr, mid+1, hi);
        int[] ans = mergeTwoArrays(arr1, arr2);

        return ans;
    }

    public static int[] mergeTwoArrays(int[] a, int[] b){
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

        return ans;
    }
}
