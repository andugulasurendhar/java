package examples.Scalar;

import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        transpose(arr);
        mirror(arr);

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }

    private static void transpose(int[][] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static void mirror(int[][] arr) {
        int l = 0, r = arr.length-1;
        while(l<r) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
            }
            l++;
            r--;
        }
    }
}
